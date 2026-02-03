package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zit {
    public final Context a;
    public final String b;
    public final String c;
    public final zwj d;
    public final afzc e;
    public final alrj f;
    public final zjj g;
    public final aqun h;
    private final fctc i;

    public zit(Context context, String str, String str2, zwj zwjVar, afzc afzcVar, alrj alrjVar, zjj zjjVar, aqun aqunVar) {
        context.getClass();
        afzcVar.getClass();
        alrjVar.getClass();
        zjjVar.getClass();
        aqunVar.getClass();
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = zwjVar;
        this.e = afzcVar;
        this.f = alrjVar;
        this.g = zjjVar;
        this.h = aqunVar;
        this.i = fctd.a(new fdae() { // from class: zip
            @Override // defpackage.fdae
            public final Object invoke() {
                return new fdgl("\\d{1}-\\d{3}-\\d{3}-\\d{4}");
            }
        });
    }

    public final String a(String str) {
        return this.f.p(str).F().toString();
    }

    public final List b(final String str) {
        final fdgl fdglVar = (fdgl) this.i.a();
        if (str.length() >= 0) {
            return fdey.g(fdey.j(new fdeu(new fdae() { // from class: fdgh
                @Override // defpackage.fdae
                public final Object invoke() {
                    return fdglVar.f(str);
                }
            }, fdgk.a), new fdap() { // from class: ziq
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    final fdgd fdgdVar = (fdgd) obj;
                    fdgdVar.getClass();
                    dijs dijsVar = dijs.c;
                    int i = fdgdVar.b().a;
                    int i2 = fdgdVar.b().b + 1;
                    String strA = fdgdVar.a();
                    final zit zitVar = this.a;
                    return new diin(dijsVar, i, i2, strA, new fdap() { // from class: zir
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            zit zitVar2 = zitVar;
                            zitVar2.e.h(new agbi(zitVar2.f.p(fdgdVar.a()), null));
                            return true;
                        }
                    });
                }
            }));
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + str.length());
    }
}
