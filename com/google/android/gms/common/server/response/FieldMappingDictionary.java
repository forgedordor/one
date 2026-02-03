package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dcmp;
import defpackage.dcmq;
import defpackage.dcmr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FieldMappingDictionary extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FieldMappingDictionary> CREATOR = new dcmq();
    final int a;
    public final String b;
    private final HashMap c;

    /* compiled from: PG */
    public static class Entry extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Entry> CREATOR = new dcmr();
        final int a;
        final String b;
        final ArrayList c;

        public Entry(int i, String str, ArrayList arrayList) {
            this.a = i;
            this.b = str;
            this.c = arrayList;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iA = dclw.a(parcel);
            dclw.i(parcel, 1, this.a);
            dclw.m(parcel, 2, this.b, false);
            dclw.n(parcel, 3, this.c, false);
            dclw.c(parcel, iA);
        }

        public Entry(String str, Map map) {
            ArrayList arrayList;
            this.a = 1;
            this.b = str;
            if (map == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (String str2 : map.keySet()) {
                    arrayList.add(new FieldMapPair(str2, (FastJsonResponse.Field) map.get(str2)));
                }
            }
            this.c = arrayList;
        }
    }

    /* compiled from: PG */
    public static class FieldMapPair extends AbstractSafeParcelable {
        public static final Parcelable.Creator<FieldMapPair> CREATOR = new dcmp();
        final int a;
        final String b;
        final FastJsonResponse.Field c;

        public FieldMapPair(int i, String str, FastJsonResponse.Field field) {
            this.a = i;
            this.b = str;
            this.c = field;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iA = dclw.a(parcel);
            dclw.i(parcel, 1, this.a);
            dclw.m(parcel, 2, this.b, false);
            dclw.k(parcel, 3, this.c, i, false);
            dclw.c(parcel, iA);
        }

        public FieldMapPair(String str, FastJsonResponse.Field field) {
            this.a = 1;
            this.b = str;
            this.c = field;
        }
    }

    public FieldMappingDictionary(int i, ArrayList arrayList, String str) {
        this.a = i;
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Entry entry = (Entry) arrayList.get(i2);
            String str2 = entry.b;
            HashMap map2 = new HashMap();
            ArrayList arrayList2 = entry.c;
            dclh.m(arrayList2);
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                FieldMapPair fieldMapPair = (FieldMapPair) entry.c.get(i3);
                map2.put(fieldMapPair.b, fieldMapPair.c);
            }
            map.put(str2, map2);
        }
        this.c = map;
        dclh.m(str);
        this.b = str;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Map map3 = (Map) this.c.get((String) it.next());
            Iterator it2 = map3.keySet().iterator();
            while (it2.hasNext()) {
                ((FastJsonResponse.Field) map3.get((String) it2.next())).j = this;
            }
        }
    }

    public final Map a(String str) {
        return (Map) this.c.get(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        HashMap map = this.c;
        for (String str : map.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map2 = (Map) map.get(str);
            for (String str2 : map2.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map2.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.c;
        for (String str : map.keySet()) {
            arrayList.add(new Entry(str, (Map) map.get(str)));
        }
        dclw.n(parcel, 2, arrayList, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.c(parcel, iA);
    }
}
