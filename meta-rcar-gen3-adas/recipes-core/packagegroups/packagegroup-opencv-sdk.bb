DESCRIPTION = "OpenCV SDK packages"

LICENSE = "BSD-3-Clause & GPLv2+ & LGPLv2+"

inherit packagegroup

PACKAGES = " \
    packagegroup-common \
    packagegroup-opencv-sdk \
    packagegroup-qt5 \
"

RDEPENDS_packagegroup-opencv-sdk = '${@ " \
    opencv \
    opencv-apps \
    opencv-dev \
    opencv-dbg \
    libopencv-calib3d \
    libopencv-core \
    libopencv-features2d \
    libopencv-flann \
    libopencv-highgui \
    libopencv-imgproc \
    libopencv-ml \
    libopencv-objdetect \
    libopencv-photo \
    libopencv-stitching \
    libopencv-superres \
    libopencv-video \
    libopencv-videostab \
    gstreamer1.0-plugins-base-app \
" if 'opencv-sdk' in '${DISTRO_FEATURES}' else ""}'

QT_WAYLAND_PKGS = '${@ " \
    qtwayland \
    qtwayland-tools \
    qtwayland-plugins \
" if 'wayland' in '${DISTRO_FEATURES}' else ""}'

RDEPENDS_packagegroup-qt5 =  '${@ " \
    qtbase-plugins \
    qtbase-examples \
    qtdeclarative \
    qtdeclarative-tools \
    qtdeclarative-qmlplugins \
    qtxmlpatterns \
    qtxmlpatterns-examples \
    qtmultimedia \
    qtmultimedia-plugins \
    qtmultimedia-qmlplugins \
    qtquickcontrols2 \
    qtquickcontrols2-qmlplugins \
    qtquickcontrols \
    qtquickcontrols-qmlplugins \
    qtgraphicaleffects \
    qtgraphicaleffects-qmlplugins \
    qtserialbus \
    qtsvg \
    qt3d \
    qt3d-runtime \
    qtlocation \
    qtsvg-plugins \
    ${QT_WAYLAND_PKGS} \
    icu libicudata libicuuc libicui18n \
    packagegroup-fonts-truetype \
" if 'qt5' in '${DISTRO_FEATURES}' else ""}'

RDEPENDS_packagegroup-common = "\
    e2fsprogs \
    e2fsprogs-e2fsck \
    e2fsprogs-mke2fs \
    e2fsprogs-tune2fs \
    i2c-tools \
    openssl \
    socat \
    strace \
    ncurses \
    libudev \
    cpufrequtils \
    tcpdump libpcap \
    bash \
    eglibc-utils \
    ldd \
    procps \
    vim \
    iproute2 \
    htop \
    mc \
    v4l-utils \
    libcomerr \
    libe2p \
    libext2fs \
    libss \
    dbus \
    can-utils libsocketcan \
    libgstapp-1.0 \
    gstreamer1.0-plugins-base-app \
    pulseaudio \
    protobuf \
    boost-system \
"
