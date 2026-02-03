package defpackage;

import java.util.Calendar;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekwg extends ekwh {
    private final ekwf c;

    public ekwg(eksu eksuVar, int i, ekwf ekwfVar) {
        super(eksuVar, i);
        this.c = ekwfVar;
        StringBuilder sb = new StringBuilder("%");
        eksuVar.f(sb);
        sb.append(true != eksuVar.d() ? 't' : 'T');
        sb.append(ekwfVar.G);
    }

    @Override // defpackage.ekwh
    public final void a(ekwi ekwiVar, Object obj) {
        ekwf ekwfVar = this.c;
        if (!(obj instanceof Date) && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            ekss.a(((ekss) ekwiVar).b, obj, "%t" + ekwfVar.G);
            return;
        }
        eksu eksuVar = this.b;
        StringBuilder sb = new StringBuilder("%");
        eksuVar.f(sb);
        sb.append(true != eksuVar.d() ? 't' : 'T');
        sb.append(ekwfVar.G);
        ((ekss) ekwiVar).b.append(String.format(ektc.a, sb.toString(), obj));
    }
}
