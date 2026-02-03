package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.LruCache;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yol {
    public final Context a;
    public final ymw b;
    public final afzc c;
    public final zce d;
    public final apql e;
    public final aqkb f;
    public final aqzm g;
    public final ajmh h;
    private final fcyh i;
    private final Conversation j;
    private final LruCache k;

    public yol(Context context, fcyh fcyhVar, ymw ymwVar, afzc afzcVar, Conversation conversation, zce zceVar, apql apqlVar, aqkb aqkbVar, aqzm aqzmVar) {
        context.getClass();
        fcyhVar.getClass();
        afzcVar.getClass();
        conversation.getClass();
        apqlVar.getClass();
        aqzmVar.getClass();
        this.a = context;
        this.i = fcyhVar;
        this.b = ymwVar;
        this.c = afzcVar;
        this.j = conversation;
        this.d = zceVar;
        this.e = apqlVar;
        this.f = aqkbVar;
        this.g = aqzmVar;
        this.k = new LruCache(100);
        this.h = conversation.c();
    }

    public final auyl a(fdjx fdjxVar, final yod yodVar) {
        fduf fdufVarA;
        Uri uriE = yodVar.a.e();
        String str = yodVar.c;
        diot diotVar = new diot(new dikx(str), new dios(yodVar.d, this.f.a()), str, yodVar.b, new fdae() { // from class: yog
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.c.h(new aggd(yodVar.a.e()));
                return true;
            }
        }, new fdae() { // from class: yoh
            @Override // defpackage.fdae
            public final Object invoke() {
                yol yolVar = this.a;
                ajmh ajmhVar = yolVar.h;
                ajlt ajltVar = yodVar.e;
                ajmhVar.L(ajltVar, 2);
                if (yolVar.g.a() && ykm.s(ajltVar)) {
                    ajmhVar.L(ajltVar, 6);
                }
                return fctx.a;
            }
        });
        ajlt ajltVar = yodVar.e;
        yoj yojVar = new yoj(ajltVar.b(), uriE);
        LruCache lruCache = this.k;
        if (!lruCache.snapshot().containsKey(yojVar)) {
            lruCache.put(yojVar, fdvf.a(diotVar));
        }
        if (((fduf) lruCache.get(yojVar)) != null) {
            fdufVarA = (fduf) lruCache.get(yojVar);
        } else {
            fdufVarA = fdvf.a(diotVar);
            lruCache.put(yojVar, fdufVarA);
        }
        auvw.k(fdjxVar, this.i, null, new yok(fdufVarA, this, uriE, yodVar, ajltVar, null), 2);
        fdufVarA.getClass();
        return auyp.a(fdufVarA);
    }
}
