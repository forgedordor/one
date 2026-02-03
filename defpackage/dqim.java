package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.R;
import j$.time.Duration;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqim extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dqir c;
    final /* synthetic */ dqgm d;
    final /* synthetic */ dqgj e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqim(fcxy fcxyVar, dqir dqirVar, dqgm dqgmVar, dqgj dqgjVar) {
        super(3, fcxyVar);
        this.c = dqirVar;
        this.d = dqgmVar;
        this.e = dqgjVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dqim dqimVar = new dqim((fcxy) obj3, this.c, this.d, this.e);
        dqimVar.f = (fdpm) obj;
        dqimVar.b = (Object[]) obj2;
        return dqimVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object dqiwVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r3 = this.f;
            Object[] objArr = (Object[]) this.b;
            Object obj2 = objArr[0];
            obj2.getClass();
            Object obj3 = objArr[1];
            obj3.getClass();
            dojp dojpVar = (dojp) objArr[2];
            Float f = (Float) objArr[3];
            Object obj4 = objArr[4];
            obj4.getClass();
            Object obj5 = objArr[5];
            obj5.getClass();
            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
            Object obj6 = objArr[6];
            obj6.getClass();
            dqij dqijVar = new dqij((dqgo) obj2, (Duration) obj3, dojpVar, f, (Duration) obj4, zBooleanValue, (dqbw) obj6);
            dqgo dqgoVar = dqijVar.a;
            Duration duration = dqijVar.b;
            dojp dojpVar2 = dqijVar.c;
            Float f2 = dqijVar.d;
            Duration durationOfMillis = dqijVar.e;
            boolean z = dqijVar.f;
            dqbw dqbwVar = dqijVar.g;
            int iOrdinal = dqgoVar.ordinal();
            if (iOrdinal == 0) {
                dqiwVar = dqiv.a;
            } else if (iOrdinal == 1) {
                dqir dqirVar = this.c;
                dqgm dqgmVar = this.d;
                dqirVar.b.c();
                dqiwVar = new dqiw(duration, (Duration) dqgmVar.b.invoke(), this.e);
            } else {
                if (iOrdinal != 2) {
                    throw new fctg();
                }
                if (dojpVar2 == null) {
                    dqiwVar = new dqiw(duration, (Duration) this.d.b.invoke(), this.e);
                } else {
                    if (!z) {
                        if (this.d.l) {
                            try {
                                dqbh dqbhVar = this.c.b;
                                Uri uri = Uri.parse(dojpVar2.b);
                                uri.getClass();
                                dqbhVar.d(uri);
                            } catch (IOException e) {
                                ((ekrd) ((ekrd) dqir.a.j()).g(e).h("com/google/android/libraries/compose/voice/ui/screen/VoiceUiAdapter$createUiDataFlow$$inlined$combine$1$3", "invokeSuspend", 139, "VoiceUiAdapter.kt")).D("Unable to prepare playback. url: %s, duration: %s", dojpVar2.b, dojpVar2.e);
                                dpgx.g(this.c.c, R.string.playback_preparation_failed_message);
                            }
                        } else {
                            dqir dqirVar2 = this.c;
                            Uri uri2 = Uri.parse(dojpVar2.b);
                            uri2.getClass();
                            dqirVar2.b.d(uri2);
                        }
                    }
                    Duration duration2 = dojpVar2.e;
                    dqir dqirVar3 = this.c;
                    float fFloatValue = f2 != null ? f2.floatValue() : duration2.toMillis() > 0 ? durationOfMillis.toMillis() / duration2.toMillis() : 0.0f;
                    if (f2 != null) {
                        durationOfMillis = Duration.ofMillis((long) (f2.floatValue() * duration2.toMillis()));
                    }
                    Duration duration3 = durationOfMillis;
                    dqbh dqbhVar2 = dqirVar3.b;
                    duration3.getClass();
                    dqbn dqbnVar = (dqbn) dqbhVar2;
                    dqiwVar = new dqiu(duration2, dqbnVar.e, dqbnVar.f, duration3, fFloatValue, dqirVar3.h, dqbwVar, new dqio(dqirVar3));
                }
            }
            this.a = 1;
            if (r3.fO(dqiwVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
