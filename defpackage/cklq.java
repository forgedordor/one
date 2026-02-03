package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cklq {
    public static final /* synthetic */ int a = 0;
    private static final fctc b = fctd.a(new fdae() { // from class: cklp
        @Override // defpackage.fdae
        public final Object invoke() {
            int i = cklq.a;
            cklr cklrVar = (cklr) cklt.a.createBuilder();
            cklrVar.getClass();
            DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((cklt) cklrVar.instance).b)).getClass();
            ckml ckmlVar = ckml.RED_HEART;
            ckml ckmlVar2 = ckml.LIKE;
            ckml ckmlVar3 = ckml.DISLIKE;
            ckml ckmlVar4 = ckml.LAUGH;
            Map mapG = fcwa.g(new fcti("loved", ckmg.a(ckmlVar).d), new fcti("heart", ckmg.a(ckmlVar).d), new fcti("liked", ckmg.a(ckmlVar2).d), new fcti("like", ckmg.a(ckmlVar2).d), new fcti("disliked", ckmg.a(ckmlVar3).d), new fcti("dislike", ckmg.a(ckmlVar3).d), new fcti("laughed at", ckmg.a(ckmlVar4).d), new fcti("laugh", ckmg.a(ckmlVar4).d), new fcti("emphasized", "‼️"), new fcti("emphasised", "‼️"), new fcti("exclamation", "‼️"), new fcti("exclamation mark", "‼️"), new fcti("questioned", "❓"), new fcti("question mark", "❓"));
            cklrVar.copyOnWrite();
            cklt ckltVar = (cklt) cklrVar.instance;
            evub evubVar = ckltVar.b;
            if (!evubVar.b) {
                ckltVar.b = evubVar.a();
            }
            ckltVar.b.putAll(mapG);
            evsn evsnVarBuild = cklrVar.build();
            evsnVarBuild.getClass();
            return (cklt) evsnVarBuild;
        }
    });

    public static final cklt a() {
        return (cklt) b.a();
    }
}
