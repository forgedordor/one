package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nxe implements nva {
    private final nwx a;
    private final long[] b;
    private final Map c;
    private final Map d;
    private final Map e;

    public nxe(nwx nwxVar, Map map, Map map2, Map map3) {
        this.a = nwxVar;
        this.d = map2;
        this.e = map3;
        this.c = DesugarCollections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        nwxVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.b = jArr;
    }

    @Override // defpackage.nva
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.nva
    public final int b(long j) {
        long[] jArr = this.b;
        int iAk = mgb.ak(jArr, j, false);
        if (iAk < jArr.length) {
            return iAk;
        }
        return -1;
    }

    @Override // defpackage.nva
    public final long c(int i) {
        return this.b[i];
    }

    @Override // defpackage.nva
    public final List e(long j) {
        ArrayList arrayList = new ArrayList();
        nwx nwxVar = this.a;
        String str = nwxVar.h;
        nwxVar.e(j, str, arrayList);
        TreeMap treeMap = new TreeMap();
        nwxVar.g(j, false, str, treeMap);
        Map map = this.c;
        Map map2 = this.d;
        nwxVar.f(j, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Map map3 = this.e;
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                nxb nxbVar = (nxb) map2.get(pair.first);
                mee.f(nxbVar);
                mdt mdtVar = new mdt();
                mdtVar.b = bitmapDecodeByteArray;
                mdtVar.f = nxbVar.b;
                mdtVar.g = 0;
                mdtVar.c(nxbVar.c, 0);
                mdtVar.e = nxbVar.e;
                mdtVar.h = nxbVar.f;
                mdtVar.i = nxbVar.g;
                mdtVar.j = nxbVar.j;
                arrayList2.add(mdtVar.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            nxb nxbVar2 = (nxb) map2.get(entry.getKey());
            mee.f(nxbVar2);
            mdt mdtVar2 = (mdt) entry.getValue();
            CharSequence charSequence = mdtVar2.a;
            mee.f(charSequence);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (nwv nwvVar : (nwv[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), nwv.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(nwvVar), spannableStringBuilder.getSpanEnd(nwvVar), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            mdtVar2.c(nxbVar2.c, nxbVar2.d);
            mdtVar2.e = nxbVar2.e;
            mdtVar2.f = nxbVar2.b;
            mdtVar2.h = nxbVar2.f;
            mdtVar2.d(nxbVar2.i, nxbVar2.h);
            mdtVar2.j = nxbVar2.j;
            arrayList2.add(mdtVar2.a());
        }
        return arrayList2;
    }
}
