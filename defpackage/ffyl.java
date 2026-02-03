package defpackage;

import android.util.Printer;
import internal.J.N;
import org.chromium.base.EarlyTraceEvent;
import org.chromium.base.TraceEvent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffyl implements Printer {
    private String a;

    public void a(String str) {
        String strD;
        EarlyTraceEvent.a();
        if (TraceEvent.a) {
            if (TraceEvent.c) {
                strD = "Looper.dispatch: EVENT_NAME_FILTERED";
            } else {
                int iIndexOf = str.indexOf(40, 18);
                int iIndexOf2 = iIndexOf == -1 ? -1 : str.indexOf(41, iIndexOf);
                String strSubstring = iIndexOf2 != -1 ? str.substring(iIndexOf + 1, iIndexOf2) : "";
                int iIndexOf3 = str.indexOf(125, 18);
                int iIndexOf4 = iIndexOf3 == -1 ? -1 : str.indexOf(58, iIndexOf3);
                if (iIndexOf4 == -1) {
                    iIndexOf4 = str.length();
                }
                strD = a.d(iIndexOf3 != -1 ? str.substring(iIndexOf3 + 2, iIndexOf4) : "", strSubstring, "Looper.dispatch: ", "(", ")");
            }
            this.a = strD;
            if (TraceEvent.a) {
                N.M_y76mct(this.a);
            } else {
                EarlyTraceEvent.a();
            }
        }
    }

    public void b(String str) {
        EarlyTraceEvent.a();
        if (TraceEvent.a && this.a != null) {
            if (TraceEvent.a) {
                N.MLJecZJ9();
            } else {
                EarlyTraceEvent.a();
            }
        }
        this.a = null;
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(">")) {
            a(str);
        } else {
            b(str);
        }
    }
}
