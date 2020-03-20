# re7zip

This tools allows to extract files directly from an archive hosted at a remote HTTP server.

Underneath the hood we use [7-Zip-JBinding library](http://sevenzipjbind.sourceforge.net/)
(based on [7-zip](http://www.7-zip.org/)) to extract files.
This tool was made with the purpose of (for example) extracting a file from a big ISO files
somewhere on the Internet without need to download the whole ISO file.

All the archives supported by 7-zip are supported by this tool, this includes:
  - auto (autodect archive type: default)
  - zip
  - tar
  - split
  - rar
  - rar5
  - lzma
  - iso
  - hfs
  - gzip
  - cpio
  - bzip2
  - 7z
  - z
  - arj
  - cab
  - lzh
  - chm
  - nsis
  - ar
  - rpm
  - udf
  - wim
  - xar
  - fat
  - ntfs


## Usage


```
$ java -jar re7zip.jar

Usage:    java -jar re7zip.jar [OPTIONS]

Options:
          /t  -t    archive filetype:
                      auto (default), zip, tar, split, rar, rar5, lzma, iso,
                      hfs, gzip, cpio, bzip2, 7z, z, arj, cab, lzh, chm, nsis,
                      ar, rpm, udf, wim, xar, fat, ntfs
          /a  -a    archive filename or URL location of archive
          /e  -e    filename to extract out of the archive
          /l  -l    list content of archive
          /o  -o    output filename for the extracted file
          /v  -v    show version info

Example:
          java -jar re7zip.jar /t=iso
                               /a=http://test.com/test.iso
                               /e=some\file.txt
                               /o=file.txt

          java -jar re7zip.jar /t=iso
                               /a=http://test.com/test.iso
                               /l

          java -jar re7zip.jar -t=iso
                               -a=http://test.com/test.iso
                               -e=some/file.txt
                               -o=file.txt

          java -jar re7zip.jar -t=iso
                               -a=http://test.com/test.iso
                               -l
```


## List all files in the remote archive

```
$ java -jar re7zip.jar -t=iso -a=http://archive.ubuntu.com/ubuntu/dists/xenial-updates/main/installer-amd64/current/images/netboot/mini.iso -l
Opening HTTP archive 'http://archive.ubuntu.com/ubuntu/dists/xenial-updates/main/installer-amd64/current/images/netboot/mini.iso'.
Archive 'http://archive.ubuntu.com/ubuntu/dists/xenial-updates/main/installer-amd64/current/images/netboot/mini.iso' is open.

Number of items in archive: 274

   Size   | Compr.Sz. | Filename
----------+-----------+---------
     null |      null | .disk
       53 |        53 | .disk/mini-info
      340 |       340 | adtxt.cfg
     null |      null | boot
     null |      null | boot/grub
  2490368 |   2490368 | boot/grub/efi.img
     5000 |      5000 | boot/grub/font.pf2
      901 |       901 | boot/grub/grub.cfg
     null |      null | boot/grub/x86_64-efi
    16120 |     16120 | boot/grub/x86_64-efi/acpi.mod
     2032 |      2032 | boot/grub/x86_64-efi/adler32.mod
    22648 |     22648 | boot/grub/x86_64-efi/ahci.mod
     1024 |      1024 | boot/grub/x86_64-efi/all_video.mod
     1608 |      1608 | boot/grub/x86_64-efi/aout.mod
     5304 |      5304 | boot/grub/x86_64-efi/appleldr.mod
     4576 |      4576 | boot/grub/x86_64-efi/archelp.mod
     7608 |      7608 | boot/grub/x86_64-efi/at_keyboard.mod
     9040 |      9040 | boot/grub/x86_64-efi/ata.mod
     2624 |      2624 | boot/grub/x86_64-efi/backtrace.mod
    10080 |     10080 | boot/grub/x86_64-efi/bfs.mod
     3264 |      3264 | boot/grub/x86_64-efi/bitmap.mod
     5328 |      5328 | boot/grub/x86_64-efi/bitmap_scale.mod
     3280 |      3280 | boot/grub/x86_64-efi/blocklist.mod
     3424 |      3424 | boot/grub/x86_64-efi/boot.mod
    49208 |     49208 | boot/grub/x86_64-efi/bsd.mod
    19688 |     19688 | boot/grub/x86_64-efi/btrfs.mod
     2952 |      2952 | boot/grub/x86_64-efi/bufio.mod
     4312 |      4312 | boot/grub/x86_64-efi/cat.mod
     5520 |      5520 | boot/grub/x86_64-efi/cbfs.mod
     6312 |      6312 | boot/grub/x86_64-efi/cbls.mod
     3960 |      3960 | boot/grub/x86_64-efi/cbmemc.mod
     1696 |      1696 | boot/grub/x86_64-efi/cbtable.mod
     4208 |      4208 | boot/grub/x86_64-efi/cbtime.mod
     8768 |      8768 | boot/grub/x86_64-efi/chain.mod
     4816 |      4816 | boot/grub/x86_64-efi/cmdline_cat_test.mod
     2984 |      2984 | boot/grub/x86_64-efi/cmp.mod
     3609 |      3609 | boot/grub/x86_64-efi/command.lst
     4400 |      4400 | boot/grub/x86_64-efi/cpio.mod
     4432 |      4432 | boot/grub/x86_64-efi/cpio_be.mod
     2680 |      2680 | boot/grub/x86_64-efi/cpuid.mod
     2264 |      2264 | boot/grub/x86_64-efi/crc64.mod
      936 |       936 | boot/grub/x86_64-efi/crypto.lst
     7032 |      7032 | boot/grub/x86_64-efi/crypto.mod
    15968 |     15968 | boot/grub/x86_64-efi/cryptodisk.mod
     3960 |      3960 | boot/grub/x86_64-efi/cs5536.mod
     3336 |      3336 | boot/grub/x86_64-efi/date.mod
     3112 |      3112 | boot/grub/x86_64-efi/datehook.mod
     2032 |      2032 | boot/grub/x86_64-efi/datetime.mod
     3184 |      3184 | boot/grub/x86_64-efi/disk.mod
    13816 |     13816 | boot/grub/x86_64-efi/diskfilter.mod
     5848 |      5848 | boot/grub/x86_64-efi/div_test.mod
     2792 |      2792 | boot/grub/x86_64-efi/dm_nv.mod
     3144 |      3144 | boot/grub/x86_64-efi/echo.mod
    13672 |     13672 | boot/grub/x86_64-efi/efi_gop.mod
     7584 |      7584 | boot/grub/x86_64-efi/efi_uga.mod
     2384 |      2384 | boot/grub/x86_64-efi/efifwsetup.mod
    10248 |     10248 | boot/grub/x86_64-efi/efinet.mod
    25040 |     25040 | boot/grub/x86_64-efi/ehci.mod
     7328 |      7328 | boot/grub/x86_64-efi/elf.mod
     2288 |      2288 | boot/grub/x86_64-efi/eval.mod
     8488 |      8488 | boot/grub/x86_64-efi/exfat.mod
     2384 |      2384 | boot/grub/x86_64-efi/exfctest.mod
     8648 |      8648 | boot/grub/x86_64-efi/ext2.mod
     8744 |      8744 | boot/grub/x86_64-efi/fat.mod
    24432 |     24432 | boot/grub/x86_64-efi/file.mod
     3104 |      3104 | boot/grub/x86_64-efi/fixvideo.mod
    17896 |     17896 | boot/grub/x86_64-efi/font.mod
      214 |       214 | boot/grub/x86_64-efi/fs.lst
     2512 |      2512 | boot/grub/x86_64-efi/gcry_arcfour.mod
     9360 |      9360 | boot/grub/x86_64-efi/gcry_blowfish.mod
    31936 |     31936 | boot/grub/x86_64-efi/gcry_camellia.mod
    14784 |     14784 | boot/grub/x86_64-efi/gcry_cast5.mod
     3992 |      3992 | boot/grub/x86_64-efi/gcry_crc.mod
    17040 |     17040 | boot/grub/x86_64-efi/gcry_des.mod
     3552 |      3552 | boot/grub/x86_64-efi/gcry_dsa.mod
     4208 |      4208 | boot/grub/x86_64-efi/gcry_idea.mod
     4320 |      4320 | boot/grub/x86_64-efi/gcry_md4.mod
     4808 |      4808 | boot/grub/x86_64-efi/gcry_md5.mod
     3392 |      3392 | boot/grub/x86_64-efi/gcry_rfc2268.mod
    21024 |     21024 | boot/grub/x86_64-efi/gcry_rijndael.mod
     8048 |      8048 | boot/grub/x86_64-efi/gcry_rmd160.mod
     3536 |      3536 | boot/grub/x86_64-efi/gcry_rsa.mod
    16136 |     16136 | boot/grub/x86_64-efi/gcry_seed.mod
    17120 |     17120 | boot/grub/x86_64-efi/gcry_serpent.mod
     7872 |      7872 | boot/grub/x86_64-efi/gcry_sha1.mod
     5496 |      5496 | boot/grub/x86_64-efi/gcry_sha256.mod
     6584 |      6584 | boot/grub/x86_64-efi/gcry_sha512.mod
    13696 |     13696 | boot/grub/x86_64-efi/gcry_tiger.mod
    34136 |     34136 | boot/grub/x86_64-efi/gcry_twofish.mod
    22968 |     22968 | boot/grub/x86_64-efi/gcry_whirlpool.mod
     9144 |      9144 | boot/grub/x86_64-efi/geli.mod
     8696 |      8696 | boot/grub/x86_64-efi/gettext.mod
    60000 |     60000 | boot/grub/x86_64-efi/gfxmenu.mod
    18032 |     18032 | boot/grub/x86_64-efi/gfxterm.mod
     4784 |      4784 | boot/grub/x86_64-efi/gfxterm_background.mod
     7912 |      7912 | boot/grub/x86_64-efi/gfxterm_menu.mod
     5160 |      5160 | boot/grub/x86_64-efi/gptsync.mod
      219 |       219 | boot/grub/x86_64-efi/grub.cfg
    11472 |     11472 | boot/grub/x86_64-efi/gzio.mod
     6864 |      6864 | boot/grub/x86_64-efi/halt.mod
     8704 |      8704 | boot/grub/x86_64-efi/hashsum.mod
    11344 |     11344 | boot/grub/x86_64-efi/hdparm.mod
     4064 |      4064 | boot/grub/x86_64-efi/help.mod
     4560 |      4560 | boot/grub/x86_64-efi/hexdump.mod
    10568 |     10568 | boot/grub/x86_64-efi/hfs.mod
    10720 |     10720 | boot/grub/x86_64-efi/hfsplus.mod
     4424 |      4424 | boot/grub/x86_64-efi/hfspluscomp.mod
     9648 |      9648 | boot/grub/x86_64-efi/http.mod
     4608 |      4608 | boot/grub/x86_64-efi/iorw.mod
     8992 |      8992 | boot/grub/x86_64-efi/jfs.mod
     8848 |      8848 | boot/grub/x86_64-efi/jpeg.mod
     6480 |      6480 | boot/grub/x86_64-efi/keylayouts.mod
     3176 |      3176 | boot/grub/x86_64-efi/keystatus.mod
     8392 |      8392 | boot/grub/x86_64-efi/ldm.mod
    16016 |     16016 | boot/grub/x86_64-efi/legacy_password_test.mod
    44552 |     44552 | boot/grub/x86_64-efi/legacycfg.mod
    21768 |     21768 | boot/grub/x86_64-efi/linux.mod
    12920 |     12920 | boot/grub/x86_64-efi/linux16.mod
    10440 |     10440 | boot/grub/x86_64-efi/linuxefi.mod
     4864 |      4864 | boot/grub/x86_64-efi/loadbios.mod
     9496 |      9496 | boot/grub/x86_64-efi/loadenv.mod
     4904 |      4904 | boot/grub/x86_64-efi/loopback.mod
     6760 |      6760 | boot/grub/x86_64-efi/ls.mod
     7368 |      7368 | boot/grub/x86_64-efi/lsacpi.mod
     5384 |      5384 | boot/grub/x86_64-efi/lsefi.mod
     3432 |      3432 | boot/grub/x86_64-efi/lsefimmap.mod
     3632 |      3632 | boot/grub/x86_64-efi/lsefisystab.mod
     2944 |      2944 | boot/grub/x86_64-efi/lsmmap.mod
     7400 |      7400 | boot/grub/x86_64-efi/lspci.mod
     3944 |      3944 | boot/grub/x86_64-efi/lssal.mod
     9520 |      9520 | boot/grub/x86_64-efi/luks.mod
     9824 |      9824 | boot/grub/x86_64-efi/lvm.mod
    12256 |     12256 | boot/grub/x86_64-efi/lzopio.mod
     5008 |      5008 | boot/grub/x86_64-efi/macbless.mod
    10816 |     10816 | boot/grub/x86_64-efi/macho.mod
     2840 |      2840 | boot/grub/x86_64-efi/mdraid09.mod
     2872 |      2872 | boot/grub/x86_64-efi/mdraid09_be.mod
     2784 |      2784 | boot/grub/x86_64-efi/mdraid1x.mod
     4624 |      4624 | boot/grub/x86_64-efi/memrw.mod
     5680 |      5680 | boot/grub/x86_64-efi/minicmd.mod
     5608 |      5608 | boot/grub/x86_64-efi/minix2.mod
     5712 |      5712 | boot/grub/x86_64-efi/minix2_be.mod
     5608 |      5608 | boot/grub/x86_64-efi/minix3.mod
     5680 |      5680 | boot/grub/x86_64-efi/minix3_be.mod
     5616 |      5616 | boot/grub/x86_64-efi/minix_be.mod
     9680 |      9680 | boot/grub/x86_64-efi/mmap.mod
     4810 |      4810 | boot/grub/x86_64-efi/moddep.lst
     3480 |      3480 | boot/grub/x86_64-efi/morse.mod
    43736 |     43736 | boot/grub/x86_64-efi/mpi.mod
     3816 |      3816 | boot/grub/x86_64-efi/msdospart.mod
    18792 |     18792 | boot/grub/x86_64-efi/multiboot.mod
    20696 |     20696 | boot/grub/x86_64-efi/multiboot2.mod
     6616 |      6616 | boot/grub/x86_64-efi/nativedisk.mod
    87848 |     87848 | boot/grub/x86_64-efi/net.mod
     4600 |      4600 | boot/grub/x86_64-efi/newc.mod
    15360 |     15360 | boot/grub/x86_64-efi/ntfs.mod
     5832 |      5832 | boot/grub/x86_64-efi/ntfscomp.mod
     4400 |      4400 | boot/grub/x86_64-efi/odc.mod
     2312 |      2312 | boot/grub/x86_64-efi/offsetio.mod
    16160 |     16160 | boot/grub/x86_64-efi/ohci.mod
     2384 |      2384 | boot/grub/x86_64-efi/part_acorn.mod
     2696 |      2696 | boot/grub/x86_64-efi/part_amiga.mod
     3120 |      3120 | boot/grub/x86_64-efi/part_apple.mod
     4288 |      4288 | boot/grub/x86_64-efi/part_bsd.mod
     2744 |      2744 | boot/grub/x86_64-efi/part_dfly.mod
     2272 |      2272 | boot/grub/x86_64-efi/part_dvh.mod
     3328 |      3328 | boot/grub/x86_64-efi/part_gpt.mod
     3112 |      3112 | boot/grub/x86_64-efi/part_msdos.mod
     2616 |      2616 | boot/grub/x86_64-efi/part_plan.mod
     2304 |      2304 | boot/grub/x86_64-efi/part_sun.mod
     2560 |      2560 | boot/grub/x86_64-efi/part_sunpc.mod
      111 |       111 | boot/grub/x86_64-efi/partmap.lst
       17 |        17 | boot/grub/x86_64-efi/parttool.lst
     7456 |      7456 | boot/grub/x86_64-efi/parttool.mod
     3040 |      3040 | boot/grub/x86_64-efi/password.mod
     4544 |      4544 | boot/grub/x86_64-efi/password_pbkdf2.mod
     7344 |      7344 | boot/grub/x86_64-efi/pata.mod
     2128 |      2128 | boot/grub/x86_64-efi/pbkdf2.mod
     3568 |      3568 | boot/grub/x86_64-efi/pbkdf2_test.mod
     3728 |      3728 | boot/grub/x86_64-efi/pcidump.mod
     3968 |      3968 | boot/grub/x86_64-efi/play.mod
    10296 |     10296 | boot/grub/x86_64-efi/png.mod
     2296 |      2296 | boot/grub/x86_64-efi/priority_queue.mod
     4304 |      4304 | boot/grub/x86_64-efi/probe.mod
     3552 |      3552 | boot/grub/x86_64-efi/procfs.mod
     3040 |      3040 | boot/grub/x86_64-efi/progress.mod
     2104 |      2104 | boot/grub/x86_64-efi/raid5rec.mod
     3368 |      3368 | boot/grub/x86_64-efi/raid6rec.mod
     2360 |      2360 | boot/grub/x86_64-efi/read.mod
     1944 |      1944 | boot/grub/x86_64-efi/reboot.mod
    76816 |     76816 | boot/grub/x86_64-efi/regexp.mod
    14128 |     14128 | boot/grub/x86_64-efi/reiserfs.mod
    25864 |     25864 | boot/grub/x86_64-efi/relocator.mod
     5840 |      5840 | boot/grub/x86_64-efi/romfs.mod
     7360 |      7360 | boot/grub/x86_64-efi/scsi.mod
    14672 |     14672 | boot/grub/x86_64-efi/serial.mod
     1032 |      1032 | boot/grub/x86_64-efi/setjmp.mod
     2720 |      2720 | boot/grub/x86_64-efi/setjmp_test.mod
     9016 |      9016 | boot/grub/x86_64-efi/setpci.mod
     8840 |      8840 | boot/grub/x86_64-efi/signature_test.mod
     3648 |      3648 | boot/grub/x86_64-efi/sleep.mod
     3552 |      3552 | boot/grub/x86_64-efi/sleep_test.mod
     3320 |      3320 | boot/grub/x86_64-efi/spkmodem.mod
     9672 |      9672 | boot/grub/x86_64-efi/squash4.mod
    29600 |     29600 | boot/grub/x86_64-efi/syslinuxcfg.mod
      162 |       162 | boot/grub/x86_64-efi/terminal.lst
     6904 |      6904 | boot/grub/x86_64-efi/terminal.mod
    19616 |     19616 | boot/grub/x86_64-efi/terminfo.mod
     7768 |      7768 | boot/grub/x86_64-efi/test.mod
     2152 |      2152 | boot/grub/x86_64-efi/test_blockarg.mod
     3912 |      3912 | boot/grub/x86_64-efi/testload.mod
     3536 |      3536 | boot/grub/x86_64-efi/testspeed.mod
     8584 |      8584 | boot/grub/x86_64-efi/tftp.mod
     6608 |      6608 | boot/grub/x86_64-efi/tga.mod
     2440 |      2440 | boot/grub/x86_64-efi/time.mod
     3744 |      3744 | boot/grub/x86_64-efi/tr.mod
     2080 |      2080 | boot/grub/x86_64-efi/trig.mod
     1960 |      1960 | boot/grub/x86_64-efi/true.mod
    11344 |     11344 | boot/grub/x86_64-efi/udf.mod
     7912 |      7912 | boot/grub/x86_64-efi/ufs1.mod
     8072 |      8072 | boot/grub/x86_64-efi/ufs1_be.mod
     7912 |      7912 | boot/grub/x86_64-efi/ufs2.mod
    10352 |     10352 | boot/grub/x86_64-efi/uhci.mod
    16016 |     16016 | boot/grub/x86_64-efi/usb.mod
     5968 |      5968 | boot/grub/x86_64-efi/usb_keyboard.mod
    11280 |     11280 | boot/grub/x86_64-efi/usbms.mod
     3080 |      3080 | boot/grub/x86_64-efi/usbserial_common.mod
     3608 |      3608 | boot/grub/x86_64-efi/usbserial_ftdi.mod
     3888 |      3888 | boot/grub/x86_64-efi/usbserial_pl2303.mod
     2440 |      2440 | boot/grub/x86_64-efi/usbserial_usbdebug.mod
     5648 |      5648 | boot/grub/x86_64-efi/usbtest.mod
    19640 |     19640 | boot/grub/x86_64-efi/verify.mod
       41 |        41 | boot/grub/x86_64-efi/video.lst
     9192 |      9192 | boot/grub/x86_64-efi/video.mod
     9288 |      9288 | boot/grub/x86_64-efi/video_bochs.mod
     9776 |      9776 | boot/grub/x86_64-efi/video_cirrus.mod
    10168 |     10168 | boot/grub/x86_64-efi/video_colors.mod
    29304 |     29304 | boot/grub/x86_64-efi/video_fb.mod
     5792 |      5792 | boot/grub/x86_64-efi/videoinfo.mod
     5560 |      5560 | boot/grub/x86_64-efi/videotest.mod
     3896 |      3896 | boot/grub/x86_64-efi/videotest_checksum.mod
    10688 |     10688 | boot/grub/x86_64-efi/xfs.mod
    41888 |     41888 | boot/grub/x86_64-efi/xnu.mod
     3360 |      3360 | boot/grub/x86_64-efi/xnu_uuid.mod
     3400 |      3400 | boot/grub/x86_64-efi/xnu_uuid_test.mod
    20496 |     20496 | boot/grub/x86_64-efi/xzio.mod
     8592 |      8592 | boot/grub/x86_64-efi/zfscrypt.mod
     2048 |      2048 | boot.cat
       56 |        56 | exithelp.cfg
      878 |       878 | f1.txt
      723 |       723 | f10.txt
      739 |       739 | f2.txt
      782 |       782 | f3.txt
      417 |       417 | f4.txt
      806 |       806 | f5.txt
     1212 |      1212 | f6.txt
      916 |       916 | f7.txt
     1051 |      1051 | f8.txt
      765 |       765 | f9.txt
 40433303 |  40433303 | initrd.gz
    40960 |     40960 | isolinux.bin
      164 |       164 | isolinux.cfg
   116492 |    116492 | ldlinux.c32
   182592 |    182592 | libcom32.c32
    23700 |     23700 | libutil.c32
  7072920 |   7072920 | linux
      460 |       460 | menu.cfg
      190 |       190 | prompt.cfg
      119 |       119 | rqtxt.cfg
     3044 |      3044 | splash.png
      523 |       523 | stdmenu.cfg
      319 |       319 | txt.cfg
    26724 |     26724 | vesamenu.c32
     2048 |      2048 | [BOOT]/Bootable_NoEmulation.img
```


## Extract file from remote archive

```
$ java -jar re7zip.jar -t=iso -a=http://archive.ubuntu.com/ubuntu/dists/xenial-updates/main/installer-amd64/current/images/netboot/mini.iso -e=boot/grub/grub.cfg -o=grub.cfg
Opening HTTP archive 'http://archive.ubuntu.com/ubuntu/dists/xenial-updates/main/installer-amd64/current/images/netboot/mini.iso'.
Archive 'http://archive.ubuntu.com/ubuntu/dists/xenial-updates/main/installer-amd64/current/images/netboot/mini.iso' is open.
Extracting file 'boot/grub/grub.cfg' ...
Percentage : 100 Reading       901 of       901 bytes
Done. Downloaded in 0 minutes and 0 seconds.

$ head grub.cfg 

if loadfont /boot/grub/font.pf2 ; then
	set gfxmode=auto
	insmod efi_gop
	insmod efi_uga
	insmod gfxterm
	terminal_output gfxterm
fi

set menu_color_normal=white/black
```


## Download compiled versions

http://reboot.pro/files/file/224-re7zip/


## History


### Version 1.4

  - Add support for reading/extracting archives from HTTPS urls.
  - Add archive type autodection and set by default (`\t auto`, `-t auto`).
  - Update [7-Zip-JBinding library](http://sevenzipjbind.sourceforge.net/) to 16.02-2.01.
    So this improves reading archives supported by 7-zip 16.02.

### Version 1.3

  - Update 7-Zip-JBinding library to 9.20-2.00beta.
  - Fix reading of WIM files.

### Version 1.2

  - Improve accessing files over HTTP
  - Add `/l` and `-l` option for listing the contents of an archive.
  - remove our hacked sevenzipjbinding-AllPlatforms.jar version: `lib/sevenzipjbinding-AllPlatforms-re7zip.jar`
  - Update [7-Zip-JBinding library](http://sevenzipjbind.sourceforge.net/) to version 4.65-1.06rc-extr-only.
  - Map archive type `7z` to `SEVEN_ZIP` so sevenzipjbinding can use it.

### Version 1.1

  - Removed hardcoded ISO location and setting.
  - Now it doesn't crash anymore when the file that needs to be extracted doesn't exist in the archive.
  - The slashes in the filename to extract don't need to have the OS specific separators anymore
  - Support for Windows and more unix-like switches.
  - Fixed some typo's in the displayed text.

### Version 1.0

  - No changes have been recorded in this version.
