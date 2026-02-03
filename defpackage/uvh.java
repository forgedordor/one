package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uvh implements uvd {
    public final eigp a;
    public final afzc b;
    private final Context c;
    private final fcsu d;
    private final ahax e;
    private final fcsu f;

    public uvh(Context context, fcsu fcsuVar, ahax ahaxVar, eigp eigpVar, afzc afzcVar, fcsu fcsuVar2) {
        context.getClass();
        ahaxVar.getClass();
        eigpVar.getClass();
        afzcVar.getClass();
        fcsuVar2.getClass();
        this.c = context;
        this.d = fcsuVar;
        this.e = ahaxVar;
        this.a = eigpVar;
        this.b = afzcVar;
        this.f = fcsuVar2;
    }

    @Override // defpackage.uvd
    public final void a() {
        ((achu) this.d.b()).h(this.c, false);
    }

    @Override // defpackage.uvd
    public final void b() {
        Context context = this.c;
        fcsu fcsuVar = this.f;
        String string = context.getString(R.string.info_dialog_title);
        String string2 = context.getString(((uzl) fcsuVar.b()).a());
        string2.getClass();
        String string3 = context.getString(R.string.info_dialog_got_it);
        string3.getClass();
        dktq dktqVar = new dktq(string3, new fdae() { // from class: uvf
            @Override // defpackage.fdae
            public final Object invoke() throws IOException {
                fczl.a(this.a.a.a("MagicComposeFeedbackAndInfoHelperImplV2: Show Magic Compose Info"), null);
                return fctx.a;
            }
        });
        String string4 = context.getString(R.string.info_dialog_learn_more);
        string4.getClass();
        this.e.c(new djmp(string, string2, fcvo.a, dktqVar, new dktq(string4, new fdae() { // from class: uvg
            @Override // defpackage.fdae
            public final Object invoke() {
                Uri uri = Uri.parse("https://support.google.com/messages?p=magic_compose");
                uri.getClass();
                this.a.b.h(new agdi(uri));
                return fctx.a;
            }
        }), new fdae() { // from class: djmo
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }), true);
    }
}
