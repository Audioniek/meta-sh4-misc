#CXXFLAGS_append_sh4 += " -std=c++11 -fPIC -fno-strict-aliasing "

FILESEXTRAPATHS_prepend := "${THISDIR}:"

SRC_URI_append += "\
	${@bb.utils.contains("MACHINE", "adb_box|arivalink200|hl101|pace7241|sagemcom88|tf7700|vip1_v2|vip2_v1|vitamin-5000hd", "file://enigma2-sh4-misc-all.patch", "", d)} \
	${@bb.utils.contains("MACHINE", "adb_box", "file://enigma2-sh4-misc-adb_box.patch", "", d)} \
	${@bb.utils.contains("MACHINE", "arivalink200", "file://enigma2-sh4-misc-arivalink200.patch", "", d)} \
	${@bb.utils.contains("MACHINE", "hl101", "file://enigma2-sh4-misc-hl101.patch", "", d)} \
	${@bb.utils.contains("MACHINE", "pace7241", "file://enigma2-sh4-misc-pace7241.patch", "", d)} \
	${@bb.utils.contains("MACHINE", "sagemcom88", "file://enigma2-sh4-misc-sagemcom88.patch", "", d)} \
	${@bb.utils.contains("MACHINE", "tf7700", "file://enigma2-sh4-misc-tf7700.patch", "", d)} \
	${@bb.utils.contains("MACHINE", "vip1_v2", "file://enigma2-sh4-misc-vip1_v2.patch", "", d)} \
	${@bb.utils.contains("MACHINE", "vip2_v1", "file://enigma2-sh4-misc-vip2_v1.patch", "", d)} \
	${@bb.utils.contains("MACHINE", "vitamin-5000hd", "file://enigma2-sh4-misc-vitamin-5000hd.patch", "", d)} \
	"

#SRCREV_FORMAT = "enigma2"

