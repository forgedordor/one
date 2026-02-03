package defpackage;

import android.net.Uri;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class rzr implements sav {
    private final sbh a;

    public rzr(rzu rzuVar) {
        sax saxVar = new sax();
        saxVar.b(new saw(), new rzq(rzuVar));
        this.a = new sbh(saxVar);
    }

    @Override // defpackage.sav
    public final void a(sau sauVar) throws IOException {
        sbc sbcVar;
        sak sakVar = new sak(sauVar.a(), 1024);
        OutputStream outputStreamB = sauVar.b();
        StringBuilder sb = new StringBuilder();
        sbe sbeVar = new sbe();
        byte[] bArr = sbg.a;
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStreamB);
        sbc sbcVar2 = new sbc();
        sbd sbdVar = new sbd();
        while (true) {
            sbcVar2.b();
            String strA = sbf.a(sakVar, sb, sbeVar);
            if (strA == null) {
                sbcVar = null;
            } else {
                String[] strArrSplit = strA.split(" ", 3);
                if (strArrSplit.length != 3) {
                    throw new IOException("Invalid request line: ".concat(strA));
                }
                sbcVar2.c = strArrSplit[0];
                sbcVar2.d = Uri.parse(strArrSplit[1]);
                String str = strArrSplit[2];
                while (true) {
                    String strA2 = sbf.a(sakVar, sb, sbeVar);
                    if (strA2 == null) {
                        throw new EOFException();
                    }
                    if ("".equals(strA2)) {
                        sbcVar = sbcVar2;
                        break;
                    }
                    String[] strArrSplit2 = strA2.split(": ", 2);
                    if (strArrSplit2.length != 2) {
                        throw new IOException("Malformed header: ".concat(strA2));
                    }
                    String str2 = strArrSplit2[0];
                    String str3 = strArrSplit2[1];
                    sbcVar2.a.add(str2);
                    sbcVar2.b.add(str3);
                }
            }
            if (sbcVar == null) {
                return;
            }
            sbh sbhVar = this.a;
            sbdVar.b();
            say sayVarA = sbhVar.a.a(sbcVar.d.getPath());
            if (sayVarA == null) {
                sbdVar.c = 404;
                sbdVar.d = "Not found";
                sbdVar.e = sba.a("No handler found\n");
            } else {
                try {
                    sayVarA.a(sbcVar, sbdVar);
                } catch (RuntimeException e) {
                    sbdVar.c = 500;
                    sbdVar.d = "Internal Server Error";
                    StringWriter stringWriter = new StringWriter();
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    try {
                        e.printStackTrace(printWriter);
                        printWriter.close();
                        sbdVar.e = sba.a(stringWriter.toString());
                    } catch (Throwable th) {
                        printWriter.close();
                        throw th;
                    }
                }
            }
            sba sbaVar = sbdVar.e;
            if (sbaVar != null) {
                sbdVar.a(ffho.a, ((saz) sbaVar).a);
                sbdVar.a("Content-Length", String.valueOf(((saz) sbdVar.e).b.length));
            }
            sbg.a("HTTP/1.1 " + sbdVar.c + " " + sbdVar.d, bufferedOutputStream);
            ArrayList arrayList = sbdVar.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sbg.a(((String) arrayList.get(i)) + ": " + ((String) sbdVar.b.get(i)), bufferedOutputStream);
            }
            bufferedOutputStream.write(sbg.a);
            bufferedOutputStream.flush();
            sba sbaVar2 = sbdVar.e;
            if (sbaVar2 != null) {
                outputStreamB.write(((saz) sbaVar2).b);
            }
        }
    }
}
