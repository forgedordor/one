package defpackage;

import android.content.Intent;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbaj extends fcyz implements fdat {
    final /* synthetic */ Intent a;
    final /* synthetic */ dbak b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbaj(Intent intent, dbak dbakVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = intent;
        this.b = dbakVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbaj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        int intExtra = this.a.getIntExtra("com.google.android.apps.messaging.youtube.extra.YOUTUBE_PLAYER_ACTION", 0);
        if (intExtra == 1) {
            dbbp dbbpVarA = ((dbap) this.b.b.b()).a();
            JSONObject jSONObjectPut = new JSONObject().put("event", "play");
            fdbq.c("activeVideoId");
            JSONObject jSONObjectPut2 = jSONObjectPut.put("videoId", (Object) null);
            jSONObjectPut2.getClass();
            dbbpVarA.a(jSONObjectPut2);
        } else if (intExtra != 2) {
            ((ekrd) dbak.a.j().h("com/google/android/apps/messaging/youtube/YouTubePlayerActionListener$onReceive$1", "invokeSuspend", 51, "YouTubePlayerActionListener.kt")).r("Unable to handle action: %d", intExtra);
        } else {
            dbbp dbbpVarA2 = ((dbap) this.b.b.b()).a();
            JSONObject jSONObjectPut3 = new JSONObject().put("event", "pause");
            fdbq.c("activeVideoId");
            JSONObject jSONObjectPut4 = jSONObjectPut3.put("videoId", (Object) null);
            jSONObjectPut4.getClass();
            dbbpVarA2.a(jSONObjectPut4);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dbaj(this.a, this.b, fcxyVar);
    }
}
