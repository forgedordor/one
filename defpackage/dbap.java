package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbap {
    private static final ekrg c;
    public dbbp a;
    public dbax b;
    private final Context d;

    static {
        fcwm.d("youtube.com", "www.youtube.com", "m.youtube.com");
        fcwm.b("youtu.be");
        c = ekrg.c("com/google/android/apps/messaging/youtube/YouTubePlayerController");
    }

    public dbap(Context context) {
        context.getClass();
        this.d = context;
    }

    public final dbbp a() {
        if (this.a == null) {
            this.a = new dbbp(this.d);
        }
        dbbp dbbpVar = this.a;
        if (dbbpVar != null) {
            return dbbpVar;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void b(dbax dbaxVar) {
        if (!fdbq.f(this.b, dbaxVar)) {
            ((ekrd) c.j().h("com/google/android/apps/messaging/youtube/YouTubePlayerController", "detachHost", 57, "YouTubePlayerController.kt")).q("Skipped detaching host that isn't active.");
            return;
        }
        ((dbaw) dbaxVar).c(new fdap() { // from class: dbar
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ViewGroup viewGroup = (ViewGroup) obj;
                ekrg ekrgVar = dbaw.a;
                viewGroup.getClass();
                viewGroup.removeAllViews();
                return fctx.a;
            }
        });
        this.b = null;
    }

    public final void c(boolean z) throws JSONException {
        dbbp dbbpVarA = a();
        dbbpVarA.g.f(Boolean.valueOf(z));
        JSONObject jSONObjectPut = new JSONObject().put("event", "setFullscreen").put("isFullscreen", z);
        jSONObjectPut.getClass();
        dbbpVarA.a(jSONObjectPut);
    }
}
