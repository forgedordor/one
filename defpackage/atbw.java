package defpackage;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atbw implements atcb {
    final /* synthetic */ atcd a;

    public atbw(atcd atcdVar) {
        this.a = atcdVar;
    }

    @Override // defpackage.atcb
    public final String a() {
        return "FinalState";
    }

    @Override // defpackage.atcb
    public final void b(atbv atbvVar) {
        Object objA;
        eksl ekslVar = (eksl) atcd.a.h();
        ekrz ekrzVar = coie.a;
        atcd atcdVar = this.a;
        String str = atcdVar.c;
        ekslVar.X(ekrzVar, str);
        ekslVar.X(coie.i, "FinalState");
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer$FinalState", "enter", 256, "InProgressFileTransfer.java")).q("Finalizing the HTTP execution flow.");
        int iB = atbvVar.b() - 1;
        if (iB != 2) {
            if (iB != 3) {
                throw new IllegalStateException(String.format("Transfer id %s finished with wrong event: %s.", str, atbu.a(atbvVar.b())));
            }
            atcdVar.j.a.b(new atdo(atbvVar.c()));
            return;
        }
        atdz atdzVar = atcdVar.j;
        UrlResponseInfo urlResponseInfo = ((atbe) atbvVar.d()).a;
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
        if (httpStatusCode == 200 || httpStatusCode == 206) {
            objA = atds.a(atdzVar.b);
        } else {
            atbp atbpVarG = atbq.g();
            atbpVarG.f(coid.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED);
            atbpVarG.e(httpStatusCode);
            Comparator comparator = String.CASE_INSENSITIVE_ORDER;
            Comparator comparator2 = ekih.a;
            comparator.getClass();
            atbpVarG.d(ekih.a(allHeaders, comparator));
            objA = new atdo(atbpVarG.a());
        }
        atdzVar.a.b(objA);
    }

    @Override // defpackage.atcb
    public final void c() {
        throw new IllegalStateException(String.format("Transfer id %s can't exit from %s.", this.a.c, "FinalState"));
    }
}
