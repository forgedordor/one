package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bajt implements Comparable, bajs {
    public final String a;
    public final String b;
    private final boolean c;
    private final Uri d;
    private final long e;

    public bajt(long j, String str, boolean z, Uri uri, long j2) {
        this.a = String.valueOf(j);
        this.b = str;
        this.c = z;
        this.d = uri;
        this.e = j2;
    }

    public static Uri d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.parse(str);
    }

    public static ParticipantColor e(ParticipantsTable.BindData bindData) {
        int iK = bindData.k();
        int iM = bindData.m();
        return iM != 1 ? iM != 2 ? new ParticipantColor(0, iK, 0) : new ParticipantColor(2, -1, bindData.n()) : new ParticipantColor(1, iK, 0);
    }

    public static String f(Resources resources, List list, String str) {
        return g(resources, list, str, false);
    }

    public static String g(Resources resources, List list, String str, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bajs bajsVar = (bajs) it.next();
            if (bajsVar.b().equals(str)) {
                if (z) {
                    arrayList.add(0, resources.getString(R.string.tombstone_self_capitalized));
                } else {
                    arrayList.add(0, resources.getString(R.string.tombstone_self));
                }
            } else if (aqbw.a()) {
                String strA = bajsVar.a();
                strA.getClass();
                arrayList.add(cssf.a(strA));
            } else {
                String strA2 = bajsVar.a();
                strA2.getClass();
                arrayList.add(cssf.c(strA2));
            }
        }
        Pattern pattern = cssr.a;
        int size = arrayList.size();
        return size != 0 ? size != 1 ? size != 2 ? resources.getString(R.string.listify_many, arrayList.get(0), Integer.valueOf(arrayList.size() - 1)) : resources.getString(R.string.listify_two, arrayList.get(0), arrayList.get(1)) : resources.getString(R.string.listify_one, arrayList.get(0)) : "";
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static List i(buxp buxpVar, fcsu fcsuVar, fcsu fcsuVar2) {
        cpbn cpbnVar = (cpbn) fcsuVar.b();
        ArrayList arrayList = new ArrayList();
        String[] strArr = ParticipantsTable.a;
        for (ParticipantsTable.BindData bindData : (ParticipantsTable.BindData[]) buxpVar.aH("participants", new ParticipantsTable.BindData[0])) {
            String strP = bindData.P();
            if (strP == null) {
                strP = bindData.Q();
            }
            if (strP == null) {
                strP = bindData.O();
            }
            Uri uriX = bindData.x();
            bindData.G();
            arrayList.add(new bajt(Long.parseLong(bindData.R()), strP == null ? "" : strP, bindData.p() == 3, cpbnVar.e(d(uriX == null ? "" : uriX.toString()), h(ejwk.b(bindData.Q())), ((alrj) fcsuVar2.b()).q(bindData), e(bindData)), buxpVar.m()));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static boolean j(List list, String str) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if (((bajs) list.get(i)).b().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.bajs
    public final String a() {
        return this.b;
    }

    @Override // defpackage.bajs
    public final String b() {
        return this.a;
    }

    @Override // defpackage.bajs
    public final boolean c() {
        return this.c;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bajt bajtVar = (bajt) obj;
        int iCompare = Long.compare(this.e, bajtVar.e);
        return iCompare != 0 ? iCompare : this.a.compareTo(bajtVar.a);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bajt)) {
            return false;
        }
        bajt bajtVar = (bajt) obj;
        String str = this.b;
        return this.a.equals(bajtVar.a) && (TextUtils.isEmpty(str) ? TextUtils.isEmpty(bajtVar.b) : str.equals(bajtVar.b)) && this.c == bajtVar.c && this.d.equals(bajtVar.d) && this.e == bajtVar.e;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Boolean.valueOf(this.c), this.d, Long.valueOf(this.e));
    }

    public final String toString() {
        return "ParticipantId: " + this.a + ", displayName: " + this.b + ", isPenpalBot: " + this.c + ", avatarUri: " + String.valueOf(this.d) + ", timeStamp: " + this.e;
    }
}
