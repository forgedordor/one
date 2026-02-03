package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhaq extends dhat {
    public final boolean Y;

    public dhaq(Context context, dgzu dgzuVar, fcsu fcsuVar, ebqr ebqrVar, ebja ebjaVar, dhgr dhgrVar, dfcg dfcgVar, dhjt dhjtVar, InstantMessageConfiguration instantMessageConfiguration, dgzb dgzbVar, deza dezaVar) throws ebmn {
        super(context, dgzuVar, fcsuVar, ebqrVar, ebjaVar, dhgrVar, dfcgVar, dhjtVar, instantMessageConfiguration, dezaVar);
        String strJ = ebqrVar.j("Referred-By");
        if (strJ != null) {
            ae(strJ, ((eblg) fcsuVar).a);
        }
        ebma ebmaVarB = dhjv.b(ebqrVar, this.m);
        ebmaVarB.getClass();
        String string = ebmaVarB.toString();
        boolean zEqualsIgnoreCase = false;
        if (!TextUtils.isEmpty(string)) {
            String strK = dhjv.k(string, this.m);
            if (!TextUtils.isEmpty(strK)) {
                dhja.c("Remote Uri: %s, user ID: %s", dhja.a(string), dhja.a(strK));
                zEqualsIgnoreCase = strK.equalsIgnoreCase("rcse-standfw");
            }
        }
        this.Y = zEqualsIgnoreCase;
        ebqo ebqoVarC = ebqrVar.c("application/sdp");
        if (Objects.isNull(ebqoVarC)) {
            throw new ebmn("Invalid request: SDP missing");
        }
        String strB = ebqoVarC.b();
        if (Objects.isNull(strB)) {
            throw new ebmn("Invalid request: SDP missing");
        }
        this.w = strB.contains("TCP/TLS/MSRP");
    }

    @Override // defpackage.dhat, defpackage.dgwe
    protected final String A() {
        return "StoreAndForwardSession";
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2 A[LOOP:0: B:21:0x0070->B:35:0x00a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a0 A[SYNTHETIC] */
    @Override // defpackage.dhat, defpackage.dgwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.ebqo[] ak() throws defpackage.dgwr, java.io.IOException {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhaq.ak():ebqo[]");
    }

    @Override // defpackage.dhat, defpackage.dgwe
    public final String[] al() {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (ai()) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add("urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session");
            arrayList2 = arrayList3;
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.add("+g.oma.sip-im");
            arrayList2 = null;
        }
        return dhjv.D(arrayList, null, arrayList2);
    }

    @Override // defpackage.dgzn
    public final boolean bg() {
        if (this.Y) {
            return false;
        }
        return super.bg();
    }
}
