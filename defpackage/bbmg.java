package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.OnDeviceDatabaseUpgradeHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbmg implements dqsq {
    final /* synthetic */ OnDeviceDatabaseUpgradeHandler a;
    private final ekgb b;
    private final boolean c;
    private int d;

    public bbmg(OnDeviceDatabaseUpgradeHandler onDeviceDatabaseUpgradeHandler, boolean z, List list) {
        this.a = onDeviceDatabaseUpgradeHandler;
        this.c = z;
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        if (list != null) {
            ekfwVar.j(list);
        }
        this.b = ekfwVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqsq
    public final int a() {
        ekgb ekgbVar = this.b;
        int i = ((ekoe) ekgbVar).c;
        int i2 = this.d;
        return i2 < i ? OnDeviceDatabaseUpgradeHandler.versionForMethod((Method) ekgbVar.get(i2)) : Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.dqsq
    public final int b() {
        return this.c ? 3 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqsq
    public final dqsp c(final dqsy dqsyVar) {
        final Method method = (Method) this.b.get(this.d);
        this.d++;
        return new bbmf(new Runnable() { // from class: bbme
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                bbmg bbmgVar = this.a;
                Method method2 = method;
                dqsy dqsyVar2 = dqsyVar;
                try {
                    method2.setAccessible(true);
                    method2.invoke(bbmgVar.a.customUpgradeSteps, dqsyVar2);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new bblf("exception running upgrade step ".concat(String.valueOf(method2.getName())), e);
                }
            }
        }, ((bble) OnDeviceDatabaseUpgradeHandler.getAnnotationOrThrow(method, bble.class)).b());
    }

    @Override // defpackage.dqsq
    public final String d() {
        return "?";
    }

    @Override // defpackage.dqsq
    public final boolean e() {
        return this.d < ((ekoe) this.b).c;
    }

    @Override // defpackage.dqsq
    public final boolean f() {
        return !this.c;
    }
}
