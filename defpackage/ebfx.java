package defpackage;

import j$.util.Optional;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebfx extends ebev {
    static final dfny a = dfnv.b("enable_cipher_list_modification");
    private final deym b;
    private final Optional e;

    public ebfx(Optional optional, deym deymVar) {
        this.e = optional;
        this.b = deymVar;
    }

    private final String[] a(String[] strArr) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        int i2 = dfps.b;
        HashSet hashSet = new HashSet(ejxk.b(',').f().a().i((CharSequence) dfps.c().a.d.a()));
        for (String str : strArr) {
            if (hashSet.contains(str)) {
                hashSet.remove(str);
            } else {
                ekfwVar.h(str);
            }
        }
        if (hashSet.isEmpty()) {
            return (String[]) ekfwVar.g().toArray(new String[0]);
        }
        ewnm ewnmVar = (ewnm) ewnx.a.createBuilder();
        ewnmVar.copyOnWrite();
        ewnx ewnxVar = (ewnx) ewnmVar.instance;
        ewnxVar.m = 11;
        ewnxVar.b |= 2048;
        ewnmVar.copyOnWrite();
        ewnx ewnxVar2 = (ewnx) ewnmVar.instance;
        ewnxVar2.c = 4;
        ewnxVar2.b |= 1;
        ewnq ewnqVar = ewnq.SOCKET_FAILURE_TLS_HANDSHAKE_FAILED;
        ewnmVar.copyOnWrite();
        ewnx ewnxVar3 = (ewnx) ewnmVar.instance;
        ewnxVar3.e = ewnqVar.j;
        ewnxVar3.b |= 4;
        this.b.j((ewnx) ewnmVar.build());
        throw new IllegalStateException("Cipher to be disabled missing from default cipher list.");
    }

    @Override // defpackage.ebev
    protected final SSLServerSocket d(SSLServerSocket sSLServerSocket) {
        if (((Boolean) a.a()).booleanValue()) {
            String[] strArrA = a(sSLServerSocket.getEnabledCipherSuites());
            SSLParameters sSLParameters = sSLServerSocket.getSSLParameters();
            if (sSLParameters == null) {
                sSLParameters = new SSLParameters();
            }
            sSLParameters.setCipherSuites(strArrA);
            sSLServerSocket.setSSLParameters(sSLParameters);
        }
        return sSLServerSocket;
    }

    @Override // defpackage.ebev
    protected final SSLSocket e(SSLSocket sSLSocket) {
        if (((Boolean) a.a()).booleanValue()) {
            String[] strArrA = a(sSLSocket.getEnabledCipherSuites());
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            if (sSLParameters == null) {
                sSLParameters = new SSLParameters();
            }
            sSLParameters.setCipherSuites(strArrA);
            sSLSocket.setSSLParameters(sSLParameters);
        }
        return sSLSocket;
    }

    @Override // defpackage.ebev
    protected final Optional f() {
        return this.e;
    }

    @Override // defpackage.ebev
    protected final ServerSocket b(ServerSocket serverSocket) {
        return serverSocket;
    }

    @Override // defpackage.ebev
    protected final Socket c(Socket socket) {
        return socket;
    }
}
