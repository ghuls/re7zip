/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readsevenzip;

import net.sf.sevenzipjbinding.IInStream;
import net.sf.sevenzipjbinding.SevenZipException;

/**
 *
 * @author wael
 */
public class MonitorIInStream implements IInStream {

    IInStream s;
    int i = 1;
    int position;


    public MonitorIInStream(IInStream s) {
        this.s = s;
    }

    public long seek(long offset, int seekOrigin) throws SevenZipException {
        long seek = s.seek(offset, seekOrigin);
//        System.out.println(getIndex()+",SEEK," + offset + "," + seekOrigin + "," + seek);
        return seek;
    }

    public int read(byte[] data) throws SevenZipException {
        int read = s.read(data);
//        System.out.println(getIndex()+",READ," + data.length + ",READING," + read);
        return read;
    }

    private synchronized  int getIndex() {
        return i++;
    }
}
