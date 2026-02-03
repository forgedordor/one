package org.bouncycastle.asn1;

import androidx.car.app.model.Alert;
import j$.nio.channels.DesugarChannels;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes6.dex */
class StreamUtil {
    StreamUtil() {
    }

    static int a(InputStream inputStream) {
        if (inputStream instanceof LimitedInputStream) {
            return ((LimitedInputStream) inputStream).d;
        }
        if (inputStream instanceof ASN1InputStream) {
            return ((ASN1InputStream) inputStream).a;
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((FileInputStream) inputStream).getChannel());
                long size = fileChannelConvertMaybeLegacyFileChannelFromLibrary != null ? fileChannelConvertMaybeLegacyFileChannelFromLibrary.size() : 2147483647L;
                if (size < 2147483647L) {
                    return (int) size;
                }
            } catch (IOException unused) {
            }
        }
        long jMaxMemory = Runtime.getRuntime().maxMemory();
        return jMaxMemory > 2147483647L ? Alert.DURATION_SHOW_INDEFINITELY : (int) jMaxMemory;
    }
}
