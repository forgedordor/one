package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class comb extends dqsi {
    public static final String[] a = {"file_transfer.message_id", "file_transfer.transfer_id", "file_transfer.transfer_type", "file_transfer.attachment_upload_response", "file_transfer.file_information", "file_transfer.thumbnail_information", "file_transfer.transfer_handle", "file_transfer.opaque_data"};
    public static final ekgp b;
    public static final colf c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("file_transfer.file_information", 55030);
        ekgiVar.i("file_transfer.thumbnail_information", 59910);
        ekgiVar.i("file_transfer.transfer_handle", 55030);
        ekgiVar.i("file_transfer.opaque_data", 56040);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("transfer_id", "index_file_transfer_transfer_id");
        ekgiVar2.c();
        c = new colf();
        d = new int[]{52060, 55030, 56040, 58450, 59910};
    }

    public static cokk a(MessageIdType messageIdType) {
        colw colwVarB = b();
        colwVarB.A("file_transfer.queryOnMessageId");
        colwVarB.q();
        coma comaVar = new coma();
        comaVar.b(messageIdType);
        colwVarB.d(comaVar);
        return (cokk) dqru.c(colwVarB.b());
    }

    public static final colw b() {
        String[] strArr;
        Integer numD = d();
        if (numD.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("file_transfer.message_id");
            ekfwVar.h("file_transfer.transfer_id");
            ekfwVar.h("file_transfer.transfer_type");
            ekfwVar.h("file_transfer.attachment_upload_response");
            if (numD.intValue() >= 55030) {
                ekfwVar.h("file_transfer.file_information");
            }
            if (numD.intValue() >= 59910) {
                ekfwVar.h("file_transfer.thumbnail_information");
            }
            if (numD.intValue() >= 55030) {
                ekfwVar.h("file_transfer.transfer_handle");
            }
            if (numD.intValue() >= 56040) {
                ekfwVar.h("file_transfer.opaque_data");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new colw(strArr);
    }

    public static dqsy c() {
        return dqru.e("$primary");
    }

    public static Integer d() {
        return Integer.valueOf(g().a());
    }

    public static Object e(MessageIdType messageIdType, Function function, Supplier supplier) {
        cokk cokkVarA = a(messageIdType);
        return cokkVarA != null ? function.apply(cokkVarA) : supplier.get();
    }

    public static void f(dqsy dqsyVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INT PRIMARY KEY REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("transfer_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("transfer_type INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("attachment_upload_response BLOB");
        if (i >= 55030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("file_information BLOB");
        }
        if (i >= 59910) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("thumbnail_information BLOB");
        }
        if (i >= 55030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("transfer_handle TEXT");
        }
        if (i >= 56040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("opaque_data BLOB");
        }
        sb.insert(0, "CREATE TABLE file_transfer (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58450) {
            arrayList.add("DROP INDEX IF EXISTS index_file_transfer_transfer_id");
            arrayList.add("CREATE INDEX index_file_transfer_transfer_id ON file_transfer(transfer_id);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa g() {
        return c().M();
    }
}
