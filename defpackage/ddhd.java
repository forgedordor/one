package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.inappreach.internal.IInAppReachService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddhd {
    public static final ddhc a = new ddhc();
    public static final ddhf b = new ddhf(new ddhe() { // from class: ddgq
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ddhe
        public final void a(Object obj, Object obj2) {
            ((ddfs) obj).a(obj2);
        }
    });

    public static void a(final ddfu ddfuVar, ddhi ddhiVar) {
        dciz dcizVar = new dciz();
        dcizVar.b = new Feature[]{ddeu.b};
        dcizVar.a = new dcir() { // from class: ddgt
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                ddhg ddhgVar = (ddhg) obj;
                ddhc ddhcVar = ddhd.a;
                ddhb ddhbVar = new ddhb((defr) obj2);
                IInAppReachService iInAppReachService = (IInAppReachService) ddhgVar.w();
                Context context = ddhgVar.c;
                iInAppReachService.fetchAccountMessages(ddhbVar, ddfuVar.toByteArray(), ddlh.a());
            }
        };
        dcizVar.c = 28010;
        ddhiVar.j(dcizVar.a());
    }
}
