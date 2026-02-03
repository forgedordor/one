package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rzq implements say {
    private final rzu a;

    public rzq(rzu rzuVar) {
        this.a = rzuVar;
    }

    @Override // defpackage.say
    public final void a(sbc sbcVar, sbd sbdVar) throws ffgu, rzo, ffgo, ffgn, IOException {
        boolean zEquals = "POST".equals(sbcVar.c);
        boolean z = !zEquals && "GET".equals(sbcVar.c);
        if (!z && !zEquals) {
            sbdVar.c = 501;
            sbdVar.d = "Not implemented";
            sbdVar.e = sba.a(String.valueOf(sbcVar.c).concat(" not implemented"));
            return;
        }
        List<String> queryParameters = sbcVar.d.getQueryParameters("argv");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        saa saaVar = new saa(new ByteArrayInputStream(new byte[0]), byteArrayOutputStream);
        String str = true != zEquals ? "WARNING" : "ERROR";
        saaVar.d.println("*** " + str + ": Using legacy HTTP protocol; update dumpapp script! ***");
        if (z) {
            rzt.b(this.a, saaVar, (String[]) queryParameters.toArray(new String[queryParameters.size()]));
        } else {
            saaVar.c(1);
        }
        sbdVar.c = BasePaymentResult.ERROR_REQUEST_FAILED;
        sbdVar.d = "OK";
        sbdVar.a("Access-Control-Allow-Origin", "*");
        sbdVar.e = new saz("application/octet-stream", byteArrayOutputStream.toByteArray());
    }
}
