package defpackage;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehwv extends ebzt {
    final /* synthetic */ ehww a;
    private final SimpleDateFormat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehwv(ehww ehwwVar) {
        super("dumpInfo");
        this.a = ehwwVar;
        this.b = new SimpleDateFormat("HH:mm:ss yyyy.MM.dd z", Locale.US);
    }

    @Override // defpackage.ebzu
    public final String c(Context context, String[] strArr) {
        StringBuilder sb = new StringBuilder("Synclets:\n");
        for (Map.Entry entry : this.a.a(strArr).entrySet()) {
            ehyr ehyrVar = (ehyr) entry.getKey();
            long jLongValue = ((Long) entry.getValue()).longValue();
            efwo efwoVar = ehyrVar.c;
            sb.append("  Synclet:\n    Key: ");
            sb.append(ehyrVar.b.b());
            sb.append("\n    Account: ");
            sb.append(efwoVar == null ? "null" : Integer.valueOf(((efwq) efwoVar).a));
            sb.append("\n    Last sync: ");
            sb.append(this.b.format(new Date(jLongValue)));
            sb.append('\n');
        }
        return sb.toString();
    }

    @Override // defpackage.ebzt, defpackage.ebzu
    public final String[] d(Context context, String[] strArr) {
        return this.a.b(strArr);
    }
}
