package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cmd {
    public static cme a(clg clgVar, clk clkVar) throws ClassNotFoundException {
        int i = clgVar.c;
        if (i == 0) {
            throw new IllegalStateException("Car App API level hasn't been established yet");
        }
        if (i < 3) {
            throw new cll("Create CarHardwareManager failed", new IllegalArgumentException("Attempted to retrieve CarHardwareManager service, but the host is less than 3"));
        }
        try {
            ServiceInfo serviceInfoA = ckq.a(clgVar);
            String string = serviceInfoA.metaData != null ? serviceInfoA.metaData.getString("androidx.car.app.CarAppMetadataHolderService.CAR_HARDWARE_MANAGER") : null;
            if (string != null) {
                return (cme) Class.forName(string).getConstructor(clg.class, clk.class).newInstance(clgVar, clkVar);
            }
            throw new ClassNotFoundException("CarHardwareManager metadata could not be found");
        } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
            throw new IllegalStateException("CarHardwareManager not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
        }
    }
}
