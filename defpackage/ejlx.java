package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class ejlx {
    public static ejha a(String str) {
        List listI = ejxk.d(":").f().a().i(str);
        if (listI.size() != 2) {
            return ejha.a;
        }
        ejgz ejgzVar = (ejgz) ejha.a.createBuilder();
        ejhb ejhbVar = (ejhb) ejhc.a.createBuilder();
        String str2 = (String) listI.get(0);
        ejhbVar.copyOnWrite();
        ejhc ejhcVar = (ejhc) ejhbVar.instance;
        str2.getClass();
        ejhcVar.b |= 1;
        ejhcVar.c = str2;
        String str3 = (String) listI.get(1);
        ejhbVar.copyOnWrite();
        ejhc ejhcVar2 = (ejhc) ejhbVar.instance;
        str3.getClass();
        ejhcVar2.b = 2 | ejhcVar2.b;
        ejhcVar2.d = str3;
        ejgzVar.copyOnWrite();
        ejha ejhaVar = (ejha) ejgzVar.instance;
        ejhc ejhcVar3 = (ejhc) ejhbVar.build();
        ejhcVar3.getClass();
        ejhaVar.c = ejhcVar3;
        ejhaVar.b |= 1;
        return (ejha) ejgzVar.build();
    }

    public static String b(ejha ejhaVar) {
        StringBuilder sb = new StringBuilder();
        if ((ejhaVar.b & 2) != 0) {
            sb.append("local_file_path: ");
            sb.append(ejhaVar.d);
        }
        int i = ejhaVar.b;
        if ((i & 1) != 0) {
            if ((i & 2) != 0) {
                sb.append("\n");
            }
            sb.append("mdd_file {    id: ");
            ejhc ejhcVar = ejhaVar.c;
            if (ejhcVar == null) {
                ejhcVar = ejhc.a;
            }
            sb.append(ejhcVar.c);
            sb.append("\n    group: ");
            ejhc ejhcVar2 = ejhaVar.c;
            if (ejhcVar2 == null) {
                ejhcVar2 = ejhc.a;
            }
            sb.append(ejhcVar2.d);
            sb.append("\n}");
        }
        return sb.toString();
    }
}
