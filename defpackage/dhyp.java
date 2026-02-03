package defpackage;

import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhyp {
    public static final dhwg a(m mVar, Map map) {
        dhpa dhpaVar = new dhpa(map);
        long j = fdhi.a;
        i iVar = new i();
        int iD = mVar.d(10);
        if (iD != 0) {
            int iC = mVar.c(iD + mVar.a);
            ByteBuffer byteBuffer = mVar.b;
            byteBuffer.getClass();
            iVar.h(iC, byteBuffer);
        } else {
            iVar = null;
        }
        if (iVar != null) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            int iD2 = iVar.d(4);
            jConvert = timeUnit.convert(timeUnit2.convert(iD2 != 0 ? iVar.b.getLong(iD2 + iVar.a) : 0L, TimeUnit.SECONDS) + (iVar.d(6) != 0 ? iVar.b.getInt(r7 + iVar.a) : 0), TimeUnit.NANOSECONDS);
        }
        fdhu fdhuVar = new fdhu(dhpaVar, fdhk.g(jConvert, fdhl.c));
        int iD3 = mVar.d(4);
        String strG = iD3 != 0 ? mVar.g(iD3 + mVar.a) : null;
        int iD4 = mVar.d(6);
        String strG2 = iD4 != 0 ? mVar.g(iD4 + mVar.a) : null;
        if (strG == null) {
            strG = "";
        }
        if (strG2 == null) {
            strG2 = "";
        }
        return new dhwg(fdhuVar, new dhpd(strG, strG2));
    }
}
