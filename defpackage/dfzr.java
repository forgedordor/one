package defpackage;

import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfzr {
    public final Context a;
    public final dhip b;
    public final deym c;
    public final Map d = new HashMap();
    private final Optional e;
    private final int[] f;

    public dfzr(Context context, Optional optional, int[] iArr, dhip dhipVar, deym deymVar) {
        this.a = context;
        this.c = deymVar;
        this.e = optional;
        this.f = iArr;
        this.b = dhipVar;
    }

    private final dfyu d(int i) {
        return (dfyu) this.d.get(Integer.valueOf(i));
    }

    public final dfyu a() {
        dfyu dfyuVarD;
        Optional optional = this.e;
        if (optional.isPresent()) {
            dfyz dfyzVar = (dfyz) optional.get();
            dfyu[] dfyuVarArr = new dfyu[18];
            dfyuVarArr[0] = d(0);
            dfyuVarArr[1] = d(1);
            dfyuVarArr[17] = d(17);
            return dfyzVar.a(dfyuVarArr);
        }
        int[] iArr = this.f;
        int i = 0;
        while (true) {
            if (i >= 3) {
                return null;
            }
            dfyuVarD = d(iArr[i]);
            if (dfyuVarD != null) {
                if (dfyuVarD.g == null) {
                    dhja.r(dfyuVarD.j, "Active interface is not available because network is null", new Object[0]);
                } else if (dfyuVarD.e.a == null) {
                    dhja.r(dfyuVarD.j, "Active interface is not available because ip address is null", new Object[0]);
                } else {
                    dhkr dhkrVarD = dfyuVarD.d();
                    try {
                        if (!dhky.a() || !dfpk.y()) {
                            dhkr dhkrVarD2 = dfyuVarD.d();
                            Network networkB = dhkrVarD2.b();
                            NetworkInfo networkInfoE = networkB != null ? dhkrVarD2.e(networkB) : null;
                            dhja.l(dfyuVarD.j, "Check if the interface %s is available and active network info is: %s", dfyuVarD.g(), networkInfoE);
                            if (networkInfoE != null && networkInfoE.isConnected() && networkInfoE.getType() == dfyuVarD.c()) {
                                break;
                            }
                        } else {
                            Network networkB2 = dhkrVarD.b();
                            dhja.l(dfyuVarD.j, "Check if the interface %s is available and active network is: %s", dfyuVarD.g(), networkB2);
                            if (networkB2 != null) {
                                NetworkCapabilities networkCapabilitiesC = dhkrVarD.c(networkB2);
                                if (!dfpk.r()) {
                                    if (networkCapabilitiesC != null && networkCapabilitiesC.hasTransport(dfyuVarD.b()) && networkCapabilitiesC.hasCapability(12) && networkCapabilitiesC.hasCapability(16)) {
                                        break;
                                    }
                                } else if (networkCapabilitiesC != null && networkCapabilitiesC.hasTransport(dfyuVarD.b()) && networkCapabilitiesC.hasCapability(12) && networkCapabilitiesC.hasCapability(16) && networkCapabilitiesC.hasCapability(21)) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    } catch (dhkf e) {
                        dhja.t(e, dfyuVarD.j, "Can't get active network info, missing permissions.", new Object[0]);
                    }
                }
            }
            i++;
        }
        return dfyuVarD;
    }

    public final /* synthetic */ void b(dfyu dfyuVar) {
        try {
            dfyuVar.j();
        } catch (SocketException e) {
            dhja.j(e, this.b, "Failed to initialize %s", dfyuVar);
        }
    }

    public final void c() {
        dhja.d(this.b, "Refreshing ImsNetworkInterfaces.", new Object[0]);
        Collection.EL.stream(this.d.values()).forEach(new Consumer() { // from class: dfzq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                this.a.b((dfyu) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
