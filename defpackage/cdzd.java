package defpackage;

import j$.util.Comparator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdzd implements cdzb {
    public static final fctc a = fctd.a(new fdae() { // from class: cdzc
        @Override // defpackage.fdae
        public final Object invoke() {
            fctc fctcVar = cdzd.a;
            fglu fgluVar = new fglu();
            for (fghp fghpVar : fcwm.d(new fghr(), new fghy())) {
                if (fghpVar instanceof fglv) {
                    ((fglv) fghpVar).a(fgluVar);
                }
            }
            return new fglw(fgluVar);
        }
    });
    public static final fdgl b = new fdgl("((]\\()|[*#_~`])");
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/message/markdown/MarkdownParserImpl");
    public final awgm c;

    public cdzd(awgm awgmVar) {
        awgmVar.getClass();
        this.c = awgmVar;
    }

    @Override // defpackage.cdzb
    public final cdze a(String str) {
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        awgm awgmVar = this.c;
        awgmVar.e.put(uuidRandomUUID, awgmVar.c.e(awgm.b));
        fglw fglwVar = (fglw) a.a();
        List list = fglwVar.a;
        fgls fglsVar = fglwVar.h;
        List list2 = fglwVar.b;
        List list3 = fglwVar.c;
        List list4 = fglwVar.d;
        Set set = fglwVar.e;
        int i = fglwVar.g;
        fgin fginVar = new fgin(list, list2, list3, list4, set);
        int i2 = 0;
        while (true) {
            int length = str.length();
            int i3 = i2;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                char cCharAt = str.charAt(i3);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                break;
            }
            fginVar.c(str.substring(i2, i3));
            i2 = i3 + 1;
            if (i2 < str.length() && str.charAt(i3) == '\r' && str.charAt(i2) == '\n') {
                i2 = i3 + 2;
            }
        }
        if (!str.isEmpty() && (i2 == 0 || i2 < str.length())) {
            fginVar.c(str.substring(i2));
        }
        fginVar.b(fginVar.o.size());
        fgje fgjeVar = new fgje(new fgiw(fginVar.i, fginVar.j, fginVar.k, fginVar.l, fginVar.n));
        Iterator it = fginVar.p.iterator();
        while (it.hasNext()) {
            ((fgmi) it.next()).e(fgjeVar);
        }
        fgik fgikVar = fginVar.m;
        Iterator it2 = fglwVar.f.iterator();
        fgle fgleVarA = fgikVar.a;
        while (it2.hasNext()) {
            fgleVarA = ((fglx) it2.next()).a();
        }
        cdzo cdzoVar = new cdzo();
        try {
            fgleVarA.d(cdzoVar);
            List list5 = cdzoVar.a;
            cdzn cdznVar = new cdzn();
            final fdat fdatVar = new fdat() { // from class: cdzf
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    dijs dijsVar;
                    dijs dijsVar2;
                    diip diipVar = (diip) obj;
                    boolean z = diipVar instanceof diin;
                    diip diipVar2 = (diip) obj2;
                    int i4 = 0;
                    if (z && ((diin) diipVar).a == dijs.q) {
                        if ((diipVar2 instanceof diim) || ((diipVar2 instanceof diin) && ((dijsVar2 = ((diin) diipVar2).a) == dijs.p || dijsVar2 == dijs.n || dijsVar2 == dijs.o))) {
                            i4 = 1;
                        }
                    } else if ((diipVar2 instanceof diin) && ((diin) diipVar2).a == dijs.q && ((diipVar instanceof diim) || (z && ((dijsVar = ((diin) diipVar).a) == dijs.p || dijsVar == dijs.n || dijsVar == dijs.o)))) {
                        i4 = -1;
                    }
                    return Integer.valueOf(i4);
                }
            };
            Comparator comparatorThenComparing = Comparator.EL.thenComparing(cdznVar, new java.util.Comparator() { // from class: cdzg
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Number) fdatVar.a(obj, obj2)).intValue();
                }
            });
            final fdat fdatVar2 = new fdat() { // from class: cdzh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    diip diipVar = (diip) obj;
                    diip diipVar2 = (diip) obj2;
                    return Integer.valueOf(diipVar.a() <= diipVar2.b() ? -1 : diipVar2.a() <= diipVar.b() ? 1 : fdbq.a(diipVar2.a(), diipVar.a()));
                }
            };
            java.util.Comparator comparatorThenComparing2 = Comparator.EL.thenComparing(comparatorThenComparing, new java.util.Comparator() { // from class: cdzi
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Number) fdatVar2.a(obj, obj2)).intValue();
                }
            });
            comparatorThenComparing2.getClass();
            StringBuilder sb = cdzoVar.b;
            List listAl = fcva.al(list5, comparatorThenComparing2);
            String string = sb.toString();
            if (listAl.size() == 1 && cdzp.d(listAl)) {
                return new cdze(str, fcvo.a);
            }
            awgm awgmVar2 = this.c;
            awgmVar2.c.f((dzub) awgmVar2.e.remove(uuidRandomUUID), awgm.b, null, dzua.SUCCESS);
            return new cdze(string, listAl);
        } catch (Exception e) {
            ((ekrd) ((ekrd) d.j()).g(e).h("com/google/android/apps/messaging/shared/message/markdown/MarkdownParserImpl", "parse", 59, "MarkdownParserImpl.kt")).q("MarkdownParser: Failed to parse markdown, falling back to plaintext.");
            return new cdze(str, fcvo.a);
        }
    }
}
