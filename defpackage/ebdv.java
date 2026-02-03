package defpackage;

import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebdv {
    static boolean a(ebro ebroVar) {
        if (ebroVar.g) {
            return ebroVar.a.equals(ebroVar.b ? null : ebroVar.c.get());
        }
        return true;
    }

    static ewnx b(int i, Socket socket, ebro ebroVar) {
        ewnm ewnmVar = (ewnm) ewnx.a.createBuilder();
        boolean z = socket instanceof SSLSocket;
        ewnt ewntVar = z ? ewnt.SOCKET_PROTOCOL_TYPE_TLS : ewnt.SOCKET_PROTOCOL_TYPE_TCP;
        ewnmVar.copyOnWrite();
        ewnx ewnxVar = (ewnx) ewnmVar.instance;
        ewnxVar.f = ewntVar.e;
        int i2 = 8;
        ewnxVar.b |= 8;
        int i3 = i - 1;
        int i4 = i3 != 1 ? i3 != 2 ? 2 : 3 : 4;
        ewnmVar.copyOnWrite();
        ewnx ewnxVar2 = (ewnx) ewnmVar.instance;
        ewnxVar2.g = i4 - 1;
        ewnxVar2.b |= 16;
        int i5 = true != z ? 2 : 5;
        ewnmVar.copyOnWrite();
        ewnx ewnxVar3 = (ewnx) ewnmVar.instance;
        ewnxVar3.c = i5 - 1;
        ewnxVar3.b |= 1;
        ebrs ebrsVar = ebroVar.a;
        switch ((ebem) ebrsVar.a) {
            case INIT:
                i2 = 2;
                break;
            case ACCEPTING:
                i2 = 3;
                break;
            case ACCEPTED:
                i2 = 4;
                break;
            case CONNECTING:
                i2 = 5;
                break;
            case CONNECTED:
                i2 = 6;
                break;
            case AUTHENTICATING:
                i2 = 7;
                break;
            case AUTHENTICATED:
                break;
            case ACTIVE:
                i2 = 9;
                break;
            case CLOSING:
                i2 = 10;
                break;
            case CLOSED:
                i2 = 11;
                break;
            case FAILED:
                i2 = 12;
                break;
            default:
                throw new IllegalArgumentException("unknown socket state");
        }
        ewnmVar.copyOnWrite();
        ewnx ewnxVar4 = (ewnx) ewnmVar.instance;
        ewnxVar4.m = i2 - 1;
        ewnxVar4.b |= 2048;
        String string = ebroVar.f.toString();
        ewnmVar.copyOnWrite();
        ewnx ewnxVar5 = (ewnx) ewnmVar.instance;
        string.getClass();
        ewnxVar5.b |= 4096;
        ewnxVar5.n = string;
        int i6 = ebroVar.h;
        ewnmVar.copyOnWrite();
        ewnx ewnxVar6 = (ewnx) ewnmVar.instance;
        ewnxVar6.b |= 16384;
        ewnxVar6.o = i6;
        int i7 = ebroVar.e;
        ewnmVar.copyOnWrite();
        ewnx ewnxVar7 = (ewnx) ewnmVar.instance;
        ewnxVar7.b |= 32768;
        ewnxVar7.p = i7;
        if (!ebroVar.b) {
            int iIntValue = ((Integer) ebroVar.d.get()).intValue();
            ewnmVar.copyOnWrite();
            ewnx ewnxVar8 = (ewnx) ewnmVar.instance;
            ewnxVar8.b |= 65536;
            ewnxVar8.q = iIntValue;
        }
        if (ebrsVar.b().isPresent()) {
            String simpleName = ((Throwable) ebrsVar.b().get()).getClass().getSimpleName();
            ewnmVar.copyOnWrite();
            ewnx ewnxVar9 = (ewnx) ewnmVar.instance;
            simpleName.getClass();
            ewnxVar9.b |= 131072;
            ewnxVar9.r = simpleName;
        }
        if (socket.getLocalSocketAddress() != null) {
            SocketAddress localSocketAddress = socket.getLocalSocketAddress();
            if (localSocketAddress instanceof InetSocketAddress) {
                int i8 = true != (((InetSocketAddress) localSocketAddress).getAddress() instanceof Inet4Address) ? 3 : 2;
                ewnmVar.copyOnWrite();
                ewnx ewnxVar10 = (ewnx) ewnmVar.instance;
                ewnxVar10.k = i8 - 1;
                ewnxVar10.b |= 256;
            }
        }
        if (socket.getRemoteSocketAddress() != null) {
            SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
            if (remoteSocketAddress instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) remoteSocketAddress;
                boolean z2 = inetSocketAddress.getAddress() instanceof Inet4Address;
                String hostString = inetSocketAddress.getHostString();
                ewnmVar.copyOnWrite();
                ewnx ewnxVar11 = (ewnx) ewnmVar.instance;
                hostString.getClass();
                ewnxVar11.b |= 32;
                ewnxVar11.h = hostString;
                int port = inetSocketAddress.getPort();
                ewnmVar.copyOnWrite();
                ewnx ewnxVar12 = (ewnx) ewnmVar.instance;
                ewnxVar12.b |= 64;
                ewnxVar12.i = port;
                int i9 = true == z2 ? 2 : 3;
                ewnmVar.copyOnWrite();
                ewnx ewnxVar13 = (ewnx) ewnmVar.instance;
                ewnxVar13.j = i9 - 1;
                ewnxVar13.b |= 128;
            }
        }
        return (ewnx) ewnmVar.build();
    }
}
