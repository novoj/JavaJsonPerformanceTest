Benchmarks (2012-01-31)
======================

Tested use case is a serialization of a rich POJO with collection of inner POJOs, referencing another POJO (see PhotoAlbum model object). Tested JSON parser must have had and direct POJO to JSON serialization and deserialization support in order to get to the suite. I've used all libraries by same naive approach - get it and use it the simpliest way possible. No tweaking, no optimalizing whatsoever (that's the way they are usually used). Average size of JSON generated JSON data is 160KB so it is rather big. The problem in production was caused by data of 33KB size in my case.

*Disclaimer* microbenchmarking results may be misleading - if you want to be sure write your own, with your custom data on your hardware to be really sure.

*Setup*
*Hardware:* Intel® Core™2 Duo CPU T7500 @ 2.20GHz × 2, SSD disk (but File IO time is not counted)
*Software:* Java(TM) SE Runtime Environment (build 1.6.0_23-b05), Java HotSpot(TM) Server VM on Ubuntu Linux 11.10 32-bit
*JVM options:* -Xmx32m -server

Data value being tested: PhotoAlbum.

Methodology:
------------

Before taking measurements, I warmed things up by running the task 250 times, next 3000 loops are counted. No other operations than the serialization or deserialization is measured. Finally average execution time is taken for each opearation and library.

Tested libraries and their versions:

- FlexJson (2.1)
- GSon (2.1)
- Jackson (1.9.4)
- JsonLib (2.4)
- JsonMarshaller (0.21)
- JsonSmart (2.0-beta2)
- Protostuff JSON (1.0.4)
- XStream (1.4.2)

Testing code is placed at GitHub: https://github.com/novoj/JavaJsonPerformanceTest