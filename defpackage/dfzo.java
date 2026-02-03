package defpackage;

import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfzo extends dfzs {
    private final ekgb a;
    private final ekgb b;
    private final Network c;
    private final NetworkCapabilities d;
    private final String e;

    public dfzo(ekgb ekgbVar, ekgb ekgbVar2, Network network, NetworkCapabilities networkCapabilities, String str) {
        this.a = ekgbVar;
        this.b = ekgbVar2;
        this.c = network;
        this.d = networkCapabilities;
        this.e = str;
    }

    @Override // defpackage.dfzs
    public final Network a() {
        return this.c;
    }

    @Override // defpackage.dfzs
    public final NetworkCapabilities b() {
        return this.d;
    }

    @Override // defpackage.dfzs
    public final ekgb c() {
        return this.b;
    }

    @Override // defpackage.dfzs
    public final ekgb d() {
        return this.a;
    }

    @Override // defpackage.dfzs
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dfzs) {
            dfzs dfzsVar = (dfzs) obj;
            if (ekjz.h(this.a, dfzsVar.d()) && ekjz.h(this.b, dfzsVar.c()) && this.c.equals(dfzsVar.a()) && this.d.equals(dfzsVar.b()) && this.e.equals(dfzsVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        NetworkCapabilities networkCapabilities = this.d;
        Network network = this.c;
        ekgb ekgbVar = this.b;
        return "NetworkInterface{ipAddresses=" + this.a.toString() + ", dnsServers=" + ekgbVar.toString() + ", network=" + network.toString() + ", networkCapabilities=" + networkCapabilities.toString() + ", interfaceName=" + this.e + "}";
    }
}
