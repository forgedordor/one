package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsps implements dsor {
    private static final eksp g = eksp.c("GnpSdk");
    public final dsoj a;
    public final fdjx b;
    public final dsoq c;
    public final Map d;
    public final Map e;
    public final Set f;
    private final dsah h;

    public dsps(dsoj dsojVar, fdjx fdjxVar, dsoq dsoqVar, dsah dsahVar) {
        dsojVar.getClass();
        fdjxVar.getClass();
        dsoqVar.getClass();
        dsahVar.getClass();
        this.a = dsojVar;
        this.b = fdjxVar;
        this.c = dsoqVar;
        this.h = dsahVar;
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashSet();
    }

    private final dxft b(dsbi dsbiVar, List list) {
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                etnt etntVar = (etnt) it.next();
                etns etnsVarB = etns.b(etntVar.c);
                if (etnsVarB == null) {
                    etnsVarB = etns.UNSPECIFIED;
                }
                if (etnsVarB == etns.LIGHT) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        etnt etntVar2 = (etnt) it2.next();
                        etns etnsVarB2 = etns.b(etntVar2.c);
                        if (etnsVarB2 == null) {
                            etnsVarB2 = etns.UNSPECIFIED;
                        }
                        if (etnsVarB2 == etns.DARK) {
                            return new dxfx(new fcti(etntVar, etntVar2));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (NoSuchElementException unused) {
            c(dsbiVar, dsoo.FAILED_THEME_NOT_FOUND);
            return new dxfp(new dsph());
        }
    }

    private final void c(dsbi dsbiVar, dsoo dsooVar) {
        fdil.d(this.b, null, null, new dspr(this, dsbiVar, dsooVar, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019e  */
    @Override // defpackage.dsor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.os.Parcelable r23, defpackage.fcxy r24) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsps.a(android.os.Parcelable, fcxy):java.lang.Object");
    }
}
