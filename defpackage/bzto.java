package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.worker.cloudstore.media.CmsTelephonyMediaRestoreWorker;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzto {
    private static final cqce c = cqce.g("BugleCms", "CmsTelephonyMediaRestoreWorkerAdapter");
    public final bzrd a;
    public final axlf b;

    public bzto(bzrd bzrdVar, axlf axlfVar) {
        this.a = bzrdVar;
        this.b = axlfVar;
    }

    public static void a(Context context, pzj pzjVar, String str, Uri uri, int i) {
        cqbd cqbdVarC = c.c();
        cqbdVarC.I("Enqueue media restore work");
        cqbdVarC.A("Part id", str);
        cqbdVarC.r();
        String strValueOf = String.valueOf(i);
        pzn pznVar = new pzn();
        pznVar.e("part_id_key", str);
        pznVar.e("parent_message_uri_key", uri.toString());
        pznVar.g("account_id", i);
        pzs pzsVarA = pznVar.a();
        qau qauVar = new qau(CmsTelephonyMediaRestoreWorker.class);
        qauVar.j(pzsVarA);
        qauVar.d("MediaRestore");
        qauVar.d(strValueOf);
        qauVar.d(qat.a(pzjVar.j));
        qauVar.g(pzjVar);
        qbq.a(context).g(a.B(i, str, "MediaRestore,", ","), pzz.a, (qav) qauVar.b());
    }
}
