package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzyt implements eyif {
    public static dzyn a(Context context, final eygg eyggVar, final fcsu fcsuVar, final fcsu fcsuVar2, final fcsu fcsuVar3) {
        Context context2 = dzyn.a;
        final dzym dzymVar = new dzym();
        dzymVar.a = context;
        eyggVar.getClass();
        dzymVar.b = new ejxr() { // from class: dzyq
            @Override // defpackage.ejxr
            public final Object get() {
                return (eosd) eyggVar.b();
            }
        };
        final ejxr ejxrVar = new ejxr() { // from class: dzyr
            @Override // defpackage.ejxr
            public final Object get() {
                return (ejwi) fcsuVar.b();
            }
        };
        dzymVar.c = new ejxr() { // from class: dzyl
            @Override // defpackage.ejxr
            public final Object get() {
                dzym dzymVar2 = dzymVar;
                return (eaaa) ((ejwi) ejxrVar.get()).d(dzyn.d(dzymVar2.a));
            }
        };
        dzymVar.d = new ejxr() { // from class: dzyr
            @Override // defpackage.ejxr
            public final Object get() {
                return (ejwi) fcsuVar2.b();
            }
        };
        dzymVar.e = new ejxr() { // from class: dzys
            @Override // defpackage.ejxr
            public final Object get() {
                return (ecev) fcsuVar3.b();
            }
        };
        return dzymVar.a();
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
