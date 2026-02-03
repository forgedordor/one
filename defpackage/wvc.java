package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvc implements wvg {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/mentions/DefaultMentionSuggestionsResolver");
    public final fdjx b;
    public final wvx c;
    public final fdpl d;
    public final fdpl e;
    private final fcsu f;
    private final fctc g;

    public wvc(fdjx fdjxVar, wvx wvxVar, fdpl fdplVar, fdpl fdplVar2, fcsu fcsuVar) {
        fdjxVar.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        fcsuVar.getClass();
        this.b = fdjxVar;
        this.c = wvxVar;
        this.d = fdplVar;
        this.e = fdplVar2;
        this.f = fcsuVar;
        this.g = fctd.a(new fdae() { // from class: wva
            @Override // defpackage.fdae
            public final Object invoke() {
                fdap fdapVar = new fdap() { // from class: wuz
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ajlk ajlkVar = (ajlk) obj;
                        ajlkVar.getClass();
                        return Boolean.valueOf(wvc.b(ajlkVar));
                    }
                };
                wvc wvcVar = this.a;
                return fdtg.b(new fdua(fdqq.b(wvcVar.e, fdapVar), wvcVar.d, new wvb(wvcVar, null)), wvcVar.b, fdur.a, cimb.a);
            }
        });
    }

    public static final boolean b(ajlk ajlkVar) {
        if (!(ajlkVar instanceof ajts)) {
            return false;
        }
        ajts ajtsVar = (ajts) ajlkVar;
        return ajtsVar.S() && ajtsVar.c() == ajlj.GROUP;
    }

    @Override // defpackage.wvg
    public final List a(String str) throws IOException {
        cimb cimbVar = (cimb) ((fdvc) this.g.a()).c();
        eieu eieuVarH = eiiy.h("DefaultMentionSuggestionsResolver#getExplicitMentionSuggestions");
        try {
            List listA = cimbVar.a(fdgn.aa(str, cimbVar.e), cimbVar.f);
            fczl.a(eieuVarH, null);
            if (!listA.isEmpty()) {
                return listA;
            }
            if (!((Boolean) this.f.b()).booleanValue()) {
                return fcvo.a;
            }
            eieuVarH = eiiy.h("DefaultMentionSuggestionsResolver#getImplicitMentionSuggestions");
            try {
                fddo fddoVar = new fddo(Math.min(cimbVar.d, str.length()), cimbVar.c, -1);
                ArrayList arrayList = new ArrayList();
                fcvy it = fddoVar.iterator();
                while (((fddp) it).a) {
                    fcva.y(arrayList, cimbVar.a(fdgn.aa(str, it.a()), cimbVar.g));
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (hashSet.add(((cilt) obj).c)) {
                        arrayList2.add(obj);
                    }
                }
                fczl.a(eieuVarH, null);
                return arrayList2;
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
