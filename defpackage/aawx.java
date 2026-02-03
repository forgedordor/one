package defpackage;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;
import j$.time.Instant;
import j$.time.ZoneId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawx implements TimePickerDialog.OnTimeSetListener {
    public static final /* synthetic */ int f = 0;
    public final aawz a;
    public final Context b;
    public final aawt c;
    public final ea d;
    public final fcsu e;

    public aawx(aawz aawzVar, aawt aawtVar, fcsu fcsuVar) {
        this.a = aawzVar;
        this.b = aawtVar.z();
        this.c = aawtVar;
        ea eaVarE = aawtVar.E();
        eaVarE.getClass();
        this.d = eaVarE;
        this.e = fcsuVar;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        einf.f(new aaxm(Instant.ofEpochMilli(this.a.b).atZone(ZoneId.systemDefault()).withHour(i).withMinute(i2)), this.d);
    }
}
