package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cueb implements cudy {
    private static final cqce d = cqce.g("BugleContacts", "ContactSelectionTrackerImpl");
    public final LinkedHashMap a;
    public final Object b = new Object();
    public cueh c;
    private final fduf e;

    public cueb(lwn lwnVar) {
        Bundle bundle = (Bundle) lwnVar.b("contact_selection_bundle");
        Integer num = (Integer) lwnVar.b("selection_mode");
        if (bundle != null) {
            this.c = cueg.a(bundle.getInt("selection_mode"));
            ArrayList<ChipData> arrayListB = craf.f ? ih.b(bundle, "identities", ChipData.class) : bundle.getParcelableArrayList("identities");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (arrayListB != null) {
                for (ChipData chipData : arrayListB) {
                    linkedHashMap.put(chipData.a, chipData);
                }
            }
            this.a = linkedHashMap;
            h("initial mode from bundle: ");
        } else if (num != null) {
            Integer num2 = (Integer) lwnVar.b("selection_mode");
            this.c = cueg.a(num2 != null ? num2.intValue() : cueh.a.ordinal());
            List<ChipData> list = (List) lwnVar.b("identities");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (list != null) {
                for (ChipData chipData2 : list) {
                    linkedHashMap2.put(chipData2.a, chipData2);
                }
            }
            this.a = linkedHashMap2;
            h("initial mode from defaultMode: ");
        } else {
            this.c = ((Boolean) ctif.b.e()).booleanValue() ? cueh.c : cueh.a;
            this.a = new LinkedHashMap();
            h("initial mode: ");
        }
        Collection collectionValues = this.a.values();
        collectionValues.getClass();
        List listAo = fcva.ao(collectionValues);
        Set setKeySet = this.a.keySet();
        setKeySet.getClass();
        this.e = fdvf.a(new cudx(listAo, ekfv.f(setKeySet), null, null, this.c));
        lwnVar.e("contact_selection_bundle", new piw() { // from class: cudz
            @Override // defpackage.piw
            public final Bundle a() {
                Bundle bundle2;
                cueb cuebVar = this.a;
                synchronized (cuebVar.b) {
                    cueh cuehVar = cuebVar.c;
                    Collection collectionValues2 = cuebVar.a.values();
                    collectionValues2.getClass();
                    List listAo2 = fcva.ao(collectionValues2);
                    cuehVar.getClass();
                    bundle2 = new Bundle();
                    bundle2.putInt("selection_mode", cuehVar.ordinal());
                    if (cuehVar != cueh.a) {
                        bundle2.putParcelableArrayList("identities", new ArrayList<>(listAo2));
                    }
                }
                return bundle2;
            }
        });
    }

    private final void h(String str) {
        cqbd cqbdVarC = d.c();
        cqbdVarC.I(str);
        cqbdVarC.I(this.c);
        cqbdVarC.I("selected count: ");
        cqbdVarC.G(this.a.size());
        cqbdVarC.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(ChipData chipData, ChipData chipData2) {
        LinkedHashMap linkedHashMap = this.a;
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        List listAo = fcva.ao(collectionValues);
        Set setKeySet = linkedHashMap.keySet();
        setKeySet.getClass();
        this.e.f(new cudx(listAo, ekfv.f(setKeySet), chipData, chipData2, this.c));
    }

    @Override // defpackage.cudy
    public final fdpl a() {
        return this.e;
    }

    @Override // defpackage.cudy
    public final void b() {
        synchronized (this.b) {
            if (this.c == cueh.a && !this.a.isEmpty()) {
                d.p("clearing 1-1 selection on resume");
                f();
                i(null, null);
            }
        }
    }

    @Override // defpackage.cudy
    public final void c(ChipData chipData) {
        chipData.getClass();
        synchronized (this.b) {
            LinkedHashMap linkedHashMap = this.a;
            alqm alqmVar = chipData.a;
            ChipData chipData2 = (ChipData) linkedHashMap.get(alqmVar);
            if (chipData2 != null && chipData2.e) {
                cqbd cqbdVarC = d.c();
                cqbdVarC.p(alqmVar);
                cqbdVarC.I("preselected contact clicked");
                cqbdVarC.r();
                return;
            }
            ChipData chipData3 = null;
            if (chipData2 != null) {
                cqbd cqbdVarC2 = d.c();
                cqbdVarC2.p(alqmVar);
                cqbdVarC2.I("removing selection chip");
                cqbdVarC2.r();
                linkedHashMap.remove(alqmVar);
                chipData3 = chipData;
                chipData = null;
            } else {
                cqbd cqbdVarC3 = d.c();
                cqbdVarC3.p(alqmVar);
                cqbdVarC3.I("adding selection chip");
                cqbdVarC3.r();
                linkedHashMap.put(alqmVar, chipData);
            }
            i(chipData, chipData3);
        }
    }

    @Override // defpackage.cudy
    public final void d(cueh cuehVar) {
        cuehVar.getClass();
        synchronized (this.b) {
            cueh cuehVar2 = this.c;
            if (cuehVar != cuehVar2) {
                cueh cuehVar3 = cueh.a;
                if ((cuehVar2 != cuehVar3 || cuehVar != cueh.b) && (cuehVar2 != cueh.b || cuehVar != cuehVar3)) {
                    throw new IllegalStateException("Check failed.");
                }
                if (cuehVar == cuehVar3) {
                    f();
                }
                d.p("changing selection mode from " + this.c + " to " + cuehVar);
                this.c = cuehVar;
                i(null, null);
            }
        }
    }

    @Override // defpackage.cudy
    public final cudx e() {
        return (cudx) this.e.c();
    }

    public final void f() {
        Set setEntrySet = this.a.entrySet();
        setEntrySet.getClass();
        fcva.A(setEntrySet, new fdap() { // from class: cuea
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                entry.getValue().getClass();
                return Boolean.valueOf(!((ChipData) r1).e);
            }
        });
    }
}
