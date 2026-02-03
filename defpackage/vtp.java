package defpackage;

import android.content.Context;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vtp {
    public vtp(Context context) {
        context.getClass();
    }

    public static final void a(emnc emncVar, int i, Boolean bool) {
        emov emovVar = (emov) empe.a.createBuilder();
        emovVar.getClass();
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            emovVar.copyOnWrite();
            empe empeVar = (empe) emovVar.instance;
            empeVar.b |= 1;
            empeVar.e = zBooleanValue;
        }
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1) {
                empa empaVar = (empa) empb.a.createBuilder();
                empaVar.getClass();
                evsn evsnVarBuild = empaVar.build();
                evsnVarBuild.getClass();
                emovVar.copyOnWrite();
                empe empeVar2 = (empe) emovVar.instance;
                empeVar2.d = (empb) evsnVarBuild;
                empeVar2.c = 103;
            } else if (i2 == 2) {
                emow emowVar = (emow) emox.a.createBuilder();
                emowVar.getClass();
                evsn evsnVarBuild2 = emowVar.build();
                evsnVarBuild2.getClass();
                emovVar.copyOnWrite();
                empe empeVar3 = (empe) emovVar.instance;
                empeVar3.d = (emox) evsnVarBuild2;
                empeVar3.c = 102;
            } else if (i2 != 3) {
                emoy emoyVar = (emoy) emoz.a.createBuilder();
                emoyVar.getClass();
                evsn evsnVarBuild3 = emoyVar.build();
                evsnVarBuild3.getClass();
                emovVar.copyOnWrite();
                empe empeVar4 = (empe) emovVar.instance;
                empeVar4.d = (emoz) evsnVarBuild3;
                empeVar4.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
            } else {
                empc empcVar = (empc) empd.a.createBuilder();
                empcVar.getClass();
                evsn evsnVarBuild4 = empcVar.build();
                evsnVarBuild4.getClass();
                emovVar.copyOnWrite();
                empe empeVar5 = (empe) emovVar.instance;
                empeVar5.d = (empd) evsnVarBuild4;
                empeVar5.c = 104;
            }
        }
        evsn evsnVarBuild5 = emovVar.build();
        evsnVarBuild5.getClass();
        emoo emooVar = emncVar.a;
        emooVar.copyOnWrite();
        emop emopVar = (emop) emooVar.instance;
        emop emopVar2 = emop.a;
        emopVar.f = (empe) evsnVarBuild5;
        emopVar.e = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
    }

    public static final emop b(int i, Boolean bool) {
        emnc emncVarA = emnb.a((emoo) emop.a.createBuilder());
        vtz.b(emncVarA, i);
        a(emncVarA, i, bool);
        return emncVarA.a();
    }
}
