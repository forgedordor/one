package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.multishare.chip.ChipData;
import com.google.android.apps.messaging.multishare.chip.ChipId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afnb implements afmz {
    private static final cqce c = cqce.g("BugleMultiShare", "ChipTrackerImpl");
    public final LinkedHashMap a;
    public final Object b;
    private final Context d;
    private final fcsu e;
    private final fduf f;
    private final cujd g;

    public afnb(Context context, fcsu fcsuVar, cujd cujdVar, lwn lwnVar) {
        LinkedHashMap linkedHashMap;
        context.getClass();
        fcsuVar.getClass();
        cujdVar.getClass();
        this.d = context;
        this.e = fcsuVar;
        this.g = cujdVar;
        this.b = new Object();
        Bundle bundle = (Bundle) lwnVar.b("chip_bundle");
        if (bundle != null) {
            ArrayList<ChipData> parcelableArrayList = craf.f ? bundle.getParcelableArrayList("identities", ChipData.class) : bundle.getParcelableArrayList("identities");
            linkedHashMap = new LinkedHashMap();
            if (parcelableArrayList != null) {
                for (ChipData chipData : parcelableArrayList) {
                    linkedHashMap.put(chipData.a, chipData);
                }
            }
        } else {
            List<ChipData> list = (List) lwnVar.b("identities");
            linkedHashMap = new LinkedHashMap();
            if (list != null) {
                for (ChipData chipData2 : list) {
                    linkedHashMap.put(chipData2.a, chipData2);
                }
            }
        }
        this.a = linkedHashMap;
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        List listAo = fcva.ao(collectionValues);
        Set setKeySet = linkedHashMap.keySet();
        setKeySet.getClass();
        this.f = fdvf.a(new afnc(listAo, ekfv.f(setKeySet), 12));
        lwnVar.e("chip_bundle", new piw() { // from class: afna
            @Override // defpackage.piw
            public final Bundle a() {
                Bundle bundle2;
                afnb afnbVar = this.a;
                synchronized (afnbVar.b) {
                    Collection collectionValues2 = afnbVar.a.values();
                    collectionValues2.getClass();
                    List listAo2 = fcva.ao(collectionValues2);
                    bundle2 = new Bundle();
                    bundle2.putParcelableArrayList("identities", new ArrayList<>(listAo2));
                }
                return bundle2;
            }
        });
    }

    @Override // defpackage.afmz
    public final afmy a() {
        return (afmy) this.f.c();
    }

    @Override // defpackage.afmz
    public final fdpl b() {
        return this.f;
    }

    @Override // defpackage.afmz
    public final void c(ChipData chipData) {
        chipData.getClass();
        synchronized (this.b) {
            LinkedHashMap linkedHashMap = this.a;
            ChipId chipId = chipData.a;
            ChipData chipData2 = null;
            if (((ChipData) linkedHashMap.get(chipId)) != null) {
                cqbd cqbdVarC = c.c();
                cqbdVarC.I("chip removed");
                cqbdVarC.r();
                chipData2 = chipData;
                chipData = null;
            } else {
                long size = linkedHashMap.size();
                fcsu fcsuVar = this.e;
                if (size > ((Number) fcsuVar.b()).longValue()) {
                    cujd cujdVar = this.g;
                    String string = this.d.getString(R.string.multi_share_max_recipient_reached, fcsuVar.b());
                    string.getClass();
                    cujdVar.a(string);
                    return;
                }
                linkedHashMap.put(chipId, chipData);
                cqbd cqbdVarC2 = c.c();
                cqbdVarC2.I("chip added");
                cqbdVarC2.r();
            }
            fduf fdufVar = this.f;
            Collection collectionValues = linkedHashMap.values();
            collectionValues.getClass();
            List listAo = fcva.ao(collectionValues);
            Set setKeySet = linkedHashMap.keySet();
            setKeySet.getClass();
            fdufVar.f(new afnc(listAo, ekfv.f(setKeySet), chipData, chipData2));
        }
    }
}
