package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class fffk {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final fffz a(Socket socket) throws IOException {
        socket.getClass();
        ffga ffgaVar = new ffga(socket);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.getClass();
        return new ffeu(ffgaVar, new fffo(outputStream, ffgaVar));
    }

    public static final ffgb b(InputStream inputStream) {
        inputStream.getClass();
        return new fffj(inputStream, new ffgd());
    }

    public static final ffgb c(Socket socket) throws IOException {
        socket.getClass();
        ffga ffgaVar = new ffga(socket);
        InputStream inputStream = socket.getInputStream();
        inputStream.getClass();
        return new ffev(ffgaVar, new fffj(inputStream, ffgaVar));
    }

    public static final boolean d(AssertionError assertionError) {
        String message;
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !fdgn.G(message, "getsockname failed", false)) ? false : true;
    }
}
