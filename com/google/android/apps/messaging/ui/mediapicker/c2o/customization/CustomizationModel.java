package com.google.android.apps.messaging.ui.mediapicker.c2o.customization;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.cywy;
import defpackage.evpz;
import defpackage.evrr;
import defpackage.evsn;
import defpackage.evtg;
import defpackage.evwl;
import defpackage.evyy;
import defpackage.evzb;
import defpackage.evzd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CustomizationModel implements Iterable<evzb>, Parcelable {
    public static final Parcelable.Creator<CustomizationModel> CREATOR = new cywy();
    public final ArrayList a;
    public boolean b;
    private final List c;

    public CustomizationModel() {
        this.b = false;
        this.a = new ArrayList();
        this.c = new ArrayList();
    }

    public final int a() {
        return this.a.size();
    }

    public final evzb b(int i) {
        return (evzb) this.a.get(i);
    }

    public final void c() {
        List list = this.c;
        list.clear();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            evzb evzbVar = (evzb) arrayList.get(i);
            if (evzbVar.d) {
                list.add(evzbVar);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<evzb> iterator() {
        return this.a.iterator();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        evyy evyyVar = (evyy) evzd.a.createBuilder();
        evyyVar.copyOnWrite();
        evzd evzdVar = (evzd) evyyVar.instance;
        evtg evtgVar = evzdVar.b;
        if (!evtgVar.c()) {
            evzdVar.b = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(this.a, evzdVar.b);
        parcel.writeParcelable(new ProtoParsers.InternalDontUse(null, (evzd) evyyVar.build()), 0);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
    }

    public CustomizationModel(Parcel parcel) {
        this.b = false;
        evzd evzdVar = (evzd) ((evwl) parcel.readParcelable(evzd.class.getClassLoader())).a(evzd.a, evrr.a());
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.addAll(evzdVar.b);
        this.b = parcel.readByte() != 0;
        this.c = new ArrayList();
        c();
    }
}
