package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eycj implements eycv {
    public final HttpURLConnection a;
    public final eycb b;
    public final byte[] c;
    public long d;
    public eycz e;
    public int f = -1;
    public int g = 0;
    private final Executor h;
    private int i;

    public eycj(HttpURLConnection httpURLConnection, String str, eyce eyceVar, eycb eycbVar, Executor executor) throws ProtocolException {
        this.a = httpURLConnection;
        try {
            httpURLConnection.setRequestMethod(str);
            httpURLConnection.setReadTimeout(300000);
            httpURLConnection.setConnectTimeout(300000);
            httpURLConnection.setDoInput(true);
            this.b = eycbVar;
            if (eycbVar != null) {
                httpURLConnection.setDoOutput(true);
                if (eycbVar.e() >= 0) {
                    long jE = eycbVar.e() - eycbVar.d();
                    if (jE < 2147483647L) {
                        httpURLConnection.setFixedLengthStreamingMode((int) jE);
                    } else {
                        httpURLConnection.setFixedLengthStreamingMode(jE);
                    }
                } else {
                    httpURLConnection.setChunkedStreamingMode(0);
                }
            }
            for (String str2 : eyceVar.c()) {
                Iterator it = eyceVar.b(str2).iterator();
                while (it.hasNext()) {
                    httpURLConnection.addRequestProperty(str2, (String) it.next());
                }
            }
            this.i = 1;
            this.c = new byte[65536];
            this.h = executor;
        } catch (ProtocolException e) {
            throw new IllegalArgumentException("Invalid http method.", e);
        }
    }

    @Override // defpackage.eycv
    public final long a() {
        return this.d;
    }

    @Override // defpackage.eycv
    public final ListenableFuture b() {
        eosa eosaVar = new eosa(new Callable() { // from class: eyci
            @Override // java.util.concurrent.Callable
            public final Object call() throws eycx, IOException {
                eycf eycfVarC;
                eycj eycjVar = this.a;
                try {
                    synchronized (eycjVar) {
                    }
                    eycjVar.g();
                    try {
                        HttpURLConnection httpURLConnection = eycjVar.a;
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        httpURLConnection.connect();
                        if (eycjVar.b == null) {
                            eycfVarC = eycjVar.c();
                        } else {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            loop0: while (true) {
                                int i = 0;
                                while (eycjVar.h()) {
                                    eycjVar.g();
                                    int i2 = 0;
                                    while (i2 < 65536 && eycjVar.h()) {
                                        try {
                                            eycb eycbVar = eycjVar.b;
                                            byte[] bArr = eycjVar.c;
                                            int iA = eycbVar.a(bArr, i2, 65536 - i2);
                                            eycjVar.d += iA;
                                            i2 += iA;
                                            try {
                                                outputStream.write(bArr, i2 - iA, iA);
                                            } catch (IOException unused) {
                                                eycfVarC = eycjVar.c();
                                            }
                                        } catch (IOException e) {
                                            throw new eycx(eycw.REQUEST_BODY_READ_ERROR, e);
                                        }
                                    }
                                    i += i2;
                                    if (i >= eycjVar.f) {
                                        boolean z = true;
                                        if (eycjVar.g > 0) {
                                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                                            if (jCurrentTimeMillis2 - jCurrentTimeMillis >= eycjVar.g) {
                                                jCurrentTimeMillis = jCurrentTimeMillis2;
                                            } else {
                                                z = false;
                                            }
                                        }
                                        if (z) {
                                            synchronized (eycjVar) {
                                                eycz eyczVar = eycjVar.e;
                                                if (eyczVar != null) {
                                                    eyczVar.b(eycjVar);
                                                }
                                            }
                                        }
                                    }
                                }
                                break loop0;
                            }
                            eycfVarC = eycjVar.c();
                        }
                    } catch (FileNotFoundException e2) {
                        throw new eycx(eycw.BAD_URL, e2);
                    } catch (IOException e3) {
                        try {
                            eycfVarC = eycjVar.c();
                        } catch (eycx unused2) {
                            throw new eycx(eycw.CONNECTION_ERROR, e3);
                        }
                    }
                    synchronized (eycjVar) {
                    }
                    return new eycy(eycfVarC);
                } catch (eycx e4) {
                    synchronized (eycjVar) {
                        return new eycy(e4);
                    }
                }
            }
        });
        Executor executor = this.h;
        if (executor != null) {
            executor.execute(eosaVar);
            return eosaVar;
        }
        eosw eoswVar = new eosw();
        eoswVar.d("Scotty-Uploader-HttpUrlConnectionHttpClient-%d");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(eosw.b(eoswVar));
        executorServiceNewSingleThreadExecutor.execute(eosaVar);
        executorServiceNewSingleThreadExecutor.shutdown();
        return eosaVar;
    }

    public final eycf c() throws eycx, IOException {
        InputStream errorStream;
        eyce eyceVar;
        g();
        try {
            int responseCode = this.a.getResponseCode();
            try {
                errorStream = this.a.getInputStream();
            } catch (IOException unused) {
                errorStream = this.a.getErrorStream();
            }
            Map<String, List<String>> headerFields = this.a.getHeaderFields();
            if (headerFields != null) {
                eyceVar = new eyce();
                for (String str : headerFields.keySet()) {
                    if (str != null) {
                        Iterator<String> it = headerFields.get(str).iterator();
                        while (it.hasNext()) {
                            eyceVar.d(str, it.next());
                        }
                    }
                }
            } else {
                eyceVar = null;
            }
            return new eycf(responseCode, eyceVar, errorStream);
        } catch (IOException e) {
            throw new eycx(eycw.CONNECTION_ERROR, "Error while reading response code.", e);
        }
    }

    @Override // defpackage.eycv
    public final String d() {
        return null;
    }

    @Override // defpackage.eycv
    public final synchronized void e(eycz eyczVar, int i, int i2) {
        this.e = eyczVar;
        if (i > 0) {
            this.f = i;
        }
        if (i2 >= 0) {
            this.g = i2;
        }
    }

    @Override // defpackage.eycv
    public final void f() {
        synchronized (this) {
            this.i = 3;
            notifyAll();
        }
    }

    public final synchronized void g() {
        int i;
        while (true) {
            i = this.i;
            if (i != 2) {
                break;
            } else {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        if (i == 3) {
            throw new eycx(eycw.CANCELED, "");
        }
        ejyb.a(i == 1);
    }

    public final boolean h() throws eycx {
        try {
            return this.b.i();
        } catch (IOException e) {
            throw new eycx(eycw.REQUEST_BODY_READ_ERROR, e);
        }
    }
}
