package defpackage;

import com.google.android.gms.droidguard.DroidGuardResultsRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dcqe {
    final String d;
    public final DroidGuardResultsRequest e;
    boolean f = false;
    final dcrf g;

    public dcqe(String str, DroidGuardResultsRequest droidGuardResultsRequest) {
        dcre dcreVar;
        int i = 0;
        this.d = str;
        if (droidGuardResultsRequest == null) {
            this.e = new DroidGuardResultsRequest();
        } else {
            this.e = droidGuardResultsRequest;
        }
        String[] strArrSplit = fbaw.b().split(",");
        int length = strArrSplit.length;
        while (true) {
            if (i >= length) {
                dcreVar = dcre.COARSE;
                break;
            } else {
                if (str.equals(strArrSplit[i])) {
                    dcreVar = dcre.FINE;
                    break;
                }
                i++;
            }
        }
        this.g = new dcrf(dcreVar, dcmy.a);
    }

    final void e(dcpo dcpoVar) {
        synchronized (this) {
            if (this.f) {
                dcpoVar.close();
                return;
            }
            this.f = true;
            try {
                d(dcpoVar);
            } catch (Exception unused) {
            }
        }
    }

    protected void d(dcpo dcpoVar) {
    }
}
