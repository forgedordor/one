package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aftk extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ afto c;
    final /* synthetic */ afmz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aftk(afto aftoVar, afmz afmzVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = aftoVar;
        this.d = afmzVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        aftk aftkVar = new aftk(this.c, this.d, (fcxy) obj3);
        aftkVar.a = (afmy) obj;
        aftkVar.b = (afti) obj2;
        return aftkVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [afmy, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        aftb aftbVar;
        Iterator it;
        dkrk dkrkVar;
        fctl.b(obj);
        ?? r1 = this.a;
        afti aftiVar = (afti) this.b;
        ekgb ekgbVar = aftiVar.a;
        if (ekgbVar.isEmpty()) {
            return new aftp(aftiVar.b, 3);
        }
        ArrayList arrayList = new ArrayList();
        final afto aftoVar = this.c;
        final afmz afmzVar = this.d;
        Context context = aftoVar.a;
        String string = context.getString(R.string.multi_share_recent_conversations_header);
        string.getClass();
        arrayList.add(new aftc("recent_conversation_header", new djyp(string)));
        Iterator it2 = ekgbVar.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            int i2 = i + 1;
            final ajlp ajlpVar = (ajlp) it2.next();
            String strB = ajlpVar.c().b();
            strB.getClass();
            ajlpVar.getClass();
            Uri uriB = ajlpVar.b();
            if (uriB == null) {
                it = it2;
                uriB = ((cpbn) aftoVar.e.b()).e(ajlpVar.b(), ajlpVar.e(), ((alrj) aftoVar.f.b()).f(), null);
            } else {
                it = it2;
            }
            Uri uri = uriB;
            if (aftoVar.l.a()) {
                cphz cphzVar = (cphz) aftoVar.m.b();
                uri.getClass();
                dkrkVar = new dkrk(cphzVar.a(uri, false), null, 0, 0, 0.0f, null, 62);
            } else {
                uri.getClass();
                dkrkVar = new dkrk(new dkpf(uri, Boolean.valueOf(ajlpVar.a() <= 1), null, 0, null, 28), null, 0, 0, 0.0f, null, 62);
            }
            String strA = aqbw.a() ? cssf.a(ajlpVar.e()) : aftoVar.g.d(ajlpVar.e());
            strA.getClass();
            arrayList.add(new aftc(strB, new djys(dkrkVar, strA, ajlpVar.d(), r1.e(ajlpVar.c()), ((eijm) aftoVar.h.b()).a("ConversationEntry.onToggle", new fdae() { // from class: aftj
                @Override // defpackage.fdae
                public final Object invoke() {
                    afxx.d((afxx) aftoVar.i.b(), 4, i, 0, 4);
                    afmzVar.c(afmx.a(ajlpVar));
                    return fctx.a;
                }
            }), new djyo(aftoVar.k.a()))));
            i = i2;
            it2 = it;
        }
        boolean z = aftiVar.d;
        if (!aftiVar.c) {
            aftbVar = null;
        } else if (z) {
            String string2 = context.getString(R.string.multi_share_more_recent_conversations);
            string2.getClass();
            aftbVar = new aftb(string2, ((eijm) aftoVar.h.b()).a("LoadMore.onClick", new fdae() { // from class: aftg
                @Override // defpackage.fdae
                public final Object invoke() {
                    afto aftoVar2 = aftoVar;
                    afxx.d((afxx) aftoVar2.i.b(), 2, 0, 0, 6);
                    fduf fdufVar = aftoVar2.n;
                    long jLongValue = ((Number) fdufVar.c()).longValue();
                    Object objB = aftoVar2.c.b();
                    objB.getClass();
                    fdufVar.f(Long.valueOf(jLongValue + ((Number) objB).longValue()));
                    return fctx.a;
                }
            }));
        } else {
            String string3 = context.getString(R.string.multi_share_less_recent_conversations);
            string3.getClass();
            aftbVar = new aftb(string3, ((eijm) aftoVar.h.b()).a("LoadLess.onClick", new fdae() { // from class: aftf
                @Override // defpackage.fdae
                public final Object invoke() {
                    afto aftoVar2 = aftoVar;
                    afxx.d((afxx) aftoVar2.i.b(), 3, 0, 0, 6);
                    Object objB = aftoVar2.b.b();
                    objB.getClass();
                    aftoVar2.n.f(objB);
                    return fctx.a;
                }
            }));
        }
        return new aftp(aftbVar, arrayList, true);
    }
}
