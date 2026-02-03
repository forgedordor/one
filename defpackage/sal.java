package defpackage;

import android.content.Context;
import android.net.Credentials;
import android.net.LocalSocket;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sal extends Thread {
    private final LocalSocket a;
    private final sat b;

    public sal(LocalSocket localSocket, sat satVar) {
        this.a = localSocket;
        this.b = satVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws IOException {
        LocalSocket localSocket;
        sat satVarA;
        Context context;
        int uid;
        int pid;
        try {
            try {
                sat satVar = this.b;
                localSocket = this.a;
                satVarA = ((saj) satVar).a();
                try {
                    context = ((sar) satVarA).b;
                    Credentials peerCredentials = localSocket.getPeerCredentials();
                    uid = peerCredentials.getUid();
                    pid = peerCredentials.getPid();
                    if (rzl.f(2)) {
                        String strA = rzl.a("Got request from uid=%d, pid=%d", Integer.valueOf(uid), Integer.valueOf(pid));
                        if (rzl.f(2)) {
                            rzk.c(2, strA);
                        }
                    }
                } catch (san e) {
                    rzk.b("Unauthorized request: ".concat(String.valueOf(e.getMessage())));
                }
            } catch (IOException e2) {
                rzl.d(rzl.a("I/O error: %s", e2));
            }
            if (context.checkPermission("android.permission.DUMP", pid, uid) != 0) {
                throw new san("Peer pid=" + pid + ", uid=" + uid + " does not have android.permission.DUMP");
            }
            sak sakVar = new sak(localSocket.getInputStream(), 256);
            ArrayList arrayList = ((saq) satVarA).a;
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No handlers added");
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sap sapVar = (sap) arrayList.get(i);
                sakVar.mark(256);
                byte[] bArr = sapVar.b.a;
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                boolean z = sakVar.read(bArr2) == length && Arrays.equals(bArr2, bArr);
                sakVar.reset();
                if (z) {
                    sapVar.a.a(new sau(localSocket, sakVar));
                    try {
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            throw new IOException("No matching handler, firstByte=" + sakVar.read());
        } finally {
            try {
                this.a.close();
            } catch (IOException unused2) {
            }
        }
    }
}
