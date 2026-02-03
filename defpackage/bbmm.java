package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class bbmm {
    public String a;
    public int b;
    public bbml c;
    public List d;
    public int e;
    public int f;
    private String j;
    private boolean k = false;
    public int g = 0;
    public boolean h = false;
    public String i = "_id";

    public final String a() {
        String str;
        int i;
        String str2;
        bbml bbmlVar;
        String strD = bbmj.d(this.b);
        cqaz.l(strD);
        List list = this.d;
        if (list != null) {
            b((String) Collection.EL.stream(list).map(new Function() { // from class: bbmk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str3 = (String) obj;
                    return String.format(Locale.US, "(OLD.%s IS NOT NEW.%s)", str3, str3);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining(" OR ")));
        }
        String strF = bbmj.f(this.b, this.c.name(), this.e);
        String strB = ejwk.b(this.a);
        String strName = this.c.name();
        String str3 = " ";
        if (!TextUtils.isEmpty(this.j)) {
            str3 = " WHEN " + this.j + " ";
        }
        String[] strArr = bprf.a;
        boolean z = this.k;
        String strConcat = "";
        String str4 = true != z ? "" : ",account_id";
        int i2 = this.g;
        String str5 = true != this.h ? "" : ",trigger_name";
        int i3 = this.e;
        int i4 = this.f;
        if (i4 == 0) {
            i4 = this.b;
        }
        bbml bbmlVar2 = bbml.INSERT;
        bbml bbmlVar3 = this.c;
        String str6 = this.i;
        if (z) {
            str = "";
            bpxu bpxuVar = bpyh.c.a;
            i = i2;
            str2 = str6;
            bbmlVar = bbmlVar2;
            strConcat = ",".concat("IFNULL((SELECT " + bpxuVar.toString() + " FROM linked_account WHERE " + bpxuVar.toString() + " IS NOT NULL LIMIT 1),-1)");
        } else {
            str = "";
            i = i2;
            bbmlVar = bbmlVar2;
            str2 = str6;
        }
        int i5 = this.g;
        String strG = i5 == 0 ? str : a.g(i5, ",");
        String strConcat2 = strF.concat(strB);
        String strA = this.h ? a.a(strConcat2, ",'", "'") : str;
        StringBuilder sb = new StringBuilder("CREATE TRIGGER ");
        sb.append(strConcat2);
        sb.append(" AFTER ");
        sb.append(strName);
        sb.append(" ON ");
        sb.append(strD);
        sb.append(str3);
        sb.append("BEGIN INSERT INTO generic_worker_queue (worker_type,enqueued_timestamp,item_table_type,item_id");
        sb.append(str4);
        sb.append(i == 0 ? str : ",flags");
        sb.append(str5);
        sb.append(") SELECT ");
        sb.append(i3);
        sb.append(",CURRENT_TIMESTAMP,");
        sb.append(i4);
        sb.append(",");
        sb.append(bbmlVar == bbmlVar3 ? "NEW" : "OLD");
        sb.append(".");
        sb.append(str2);
        sb.append(strConcat);
        sb.append(strG);
        sb.append(strA);
        sb.append("; END");
        return sb.toString();
    }

    public final void b(String str) {
        if (str == null) {
            return;
        }
        if (TextUtils.isEmpty(this.j)) {
            this.j = str;
            return;
        }
        String str2 = this.j;
        str2.getClass();
        this.j = str2.concat(a.a(str, " AND (", ")"));
    }

    public final void c() {
        this.k = true;
    }
}
