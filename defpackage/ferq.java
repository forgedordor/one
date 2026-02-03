package defpackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ferq extends femz {
    private static final DateFormat c;
    private static final long serialVersionUID = 2523330383042085994L;
    private long[] d;
    private fenh[] e;
    private fend f;
    private fend g;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss");
        c = simpleDateFormat;
        simpleDateFormat.setTimeZone(fexc.a);
        simpleDateFormat.setLenient(false);
    }

    protected ferq(String str) {
        super(str);
        new TreeMap();
        this.f = null;
    }

    private final fenh d(fenh fenhVar) {
        fenh fenhVar2 = new fenh((byte[]) null);
        fenhVar2.setTime(fenhVar.getTime() - ((fewi) a("TZOFFSETFROM")).c.a);
        return fenhVar2;
    }

    private static final fenh e(fend fendVar) {
        long time;
        String string = fendVar.toString();
        DateFormat dateFormat = c;
        synchronized (dateFormat) {
            time = dateFormat.parse(string).getTime();
        }
        fenh fenhVar = new fenh((byte[]) null);
        fenhVar.setTime(time);
        return fenhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x02f7, code lost:
    
        r2 = new java.lang.Object[1];
        r2[r17] = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0307, code lost:
    
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format("Invalid week number [{0}]", r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03d6, code lost:
    
        r2 = new java.lang.Object[1];
        r2[r17] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03e6, code lost:
    
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format("Invalid year day [{0}]", r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014e, code lost:
    
        r39 = r4;
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0152, code lost:
    
        r26 = r7;
        r31 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0623  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fend c(defpackage.fend r41) {
        /*
            Method dump skipped, instructions count: 2390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ferq.c(fend):fend");
    }

    protected ferq(String str, ferc fercVar) {
        super(str, fercVar);
        new TreeMap();
        this.f = null;
    }
}
