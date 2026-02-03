package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dogi {
    static final /* synthetic */ dogi a = new dogi();
    private static final ekrg b = ekrg.c("com/google/android/libraries/compose/media/Format$MediaFormat");

    private dogi() {
    }

    public static final dogj a(doig doigVar, boolean z) {
        try {
            doif doifVar = doigVar.b;
            boolean zF = fdbq.f(doifVar, doia.a);
            String str = doigVar.c;
            String str2 = true != z ? str : null;
            if (str2 == null) {
                str2 = "*";
            }
            if (zF) {
                int i = dogg.b;
                return d(str, z ? fcva.g(dofr.a, doft.a) : fcva.g(dogf.a, dofp.a, dofr.a, doft.a, dofv.a, dofx.a, dofz.a, dogb.a), new dogd(str2));
            }
            if (fdbq.f(doifVar, doid.a)) {
                dohf dohfVar = dohm.b;
                return d(str, dogr.a(), new dohf(str2));
            }
            if (fdbq.f(doifVar, doie.a)) {
                fctc fctcVar = dojm.b;
                return d(str, doir.a(), new dojd(str2));
            }
            throw new IllegalArgumentException(doifVar.b() + " doesn't have any registered format");
        } catch (IllegalArgumentException e) {
            ((ekrd) ((ekrd) b.j()).g(e).h("com/google/android/libraries/compose/media/Format$MediaFormat", "fromMediaType", 60, "Format.kt")).t("No media type matches %s", doigVar);
            return null;
        }
    }

    public static final dogj b(doig doigVar) {
        dogj dogjVarA = a(doigVar, false);
        if (dogjVarA != null) {
            return dogjVarA;
        }
        throw new IllegalArgumentException(a.h(doigVar, "Cannot get Format for ", "."));
    }

    public static final dogj c(String str) {
        doig doigVarA = dohx.a(str);
        if (doigVarA != null) {
            return b(doigVarA);
        }
        throw new IllegalArgumentException("Cannot infer Media Type from ".concat(str));
    }

    private static final dogj d(String str, Iterable iterable, dogj dogjVar) {
        Object next;
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (fdbq.f(((dogj) next).a(), str)) {
                break;
            }
        }
        dogj dogjVar2 = (dogj) next;
        return dogjVar2 == null ? dogjVar : dogjVar2;
    }
}
