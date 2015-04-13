An extended version of 7zip in Java that allows downloading single files from an archive hosted somewhere on the Internet.

To get an idea of why this would be useful to you, imagine that you only need a single file that is found inside a huge 4Gb ISO file somewhere on the Internet.

This tool saves you the time and need of downloading the whole thing. Just grab the files you need and of you go.. :)

Here is the syntax:

```
Usage:    java -jar re7zip.jar [OPTIONS]

Options:
          /t  -t    archive filetype:
                      zip, tar, split, rar, lzma, iso, hfs, gzip, cpio, bzip2,
                      7z, z, arj, cab, lzh, chm, nsis, deb, rpm, udf, wim, xar,
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
                               -l

          java -jar re7zip.jar -t=iso
                               -a=http://test.com/test.iso
                               -e=some/file.txt
                               -o=file.txt

          java -jar re7zip.jar -t=iso
                               -a=http://test.com/test.iso
                               -l
```


---


To post feedback or read the ongoing talk about this tool, please visit http://reboot.pro/17283/

[Download page](http://reboot.pro/files/file/224-re7zip/)