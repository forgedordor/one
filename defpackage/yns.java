package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.format.Formatter;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yns implements ykl {
    public final afzc a;
    public final aqzm b;
    public final ajmh c;
    private final Context d;
    private final Conversation e;
    private final aqkb f;

    public yns(Context context, afzc afzcVar, Conversation conversation, aqzm aqzmVar, aqkb aqkbVar) {
        context.getClass();
        afzcVar.getClass();
        conversation.getClass();
        aqzmVar.getClass();
        this.d = context;
        this.a = afzcVar;
        this.e = conversation;
        this.b = aqzmVar;
        this.f = aqkbVar;
        this.c = conversation.c();
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ dkgq a(ykp ykpVar) {
        final ynp ynpVar = (ynp) ykpVar;
        amvp amvpVar = ynpVar.b;
        final Uri uriE = amvpVar.e();
        final String strG = amvpVar.g();
        final long jA = amvpVar.a();
        final String strB = amvpVar.b();
        int iA = ynn.a(strB);
        String fileSize = jA <= 0 ? "" : Formatter.formatFileSize(this.d, jA);
        boolean z = ynpVar.e;
        dkpc dkpcVar = ynpVar.f;
        final ajlt ajltVar = ynpVar.a;
        String str = ynpVar.d;
        aqkb aqkbVar = this.f;
        return new diot(new dila(iA, strG, fileSize, str, dkpcVar, aqkbVar.a(), null, 64), new dios(z, aqkbVar.a()), str, ynpVar.c, new fdae() { // from class: ynq
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.a.h(new agcu(uriE, strB, strG, jA, true));
                return true;
            }
        }, new fdae() { // from class: ynr
            @Override // defpackage.fdae
            public final Object invoke() {
                yns ynsVar = this.a;
                ajmh ajmhVar = ynsVar.c;
                ajmhVar.L(ajltVar, 2);
                if (ynsVar.b.a()) {
                    ajlt ajltVar2 = ynpVar.a;
                    if (ykm.s(ajltVar2)) {
                        ajmhVar.L(ajltVar2, 6);
                    }
                }
                return fctx.a;
            }
        });
    }
}
