package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etfa implements etfg {
    private final etdu a;
    private final etfh b;
    private final Set c = ekpg.i();

    public etfa(etdu etduVar, etfh etfhVar) {
        this.a = etduVar;
        this.b = etfhVar;
    }

    private final synchronized void b(String str) {
        InputStream inputStreamOpen;
        List list;
        if (this.c.contains(str)) {
            return;
        }
        try {
            try {
                inputStreamOpen = ((etex) this.a).b.open(str, 3);
            } catch (FileNotFoundException unused) {
                etex.a.logp(Level.WARNING, "com.google.i18n.phonenumbers.metadata.init.AndroidAssetMetadataLoader", "loadMetadata", String.format("File %s not found", str));
                inputStreamOpen = null;
            } catch (IOException e) {
                throw new etey(String.format("Error while opening %s: ", str), e);
            }
            InputStream inputStream = inputStreamOpen;
            if (inputStream == null) {
                list = Collections.EMPTY_LIST;
            } else {
                try {
                    try {
                        evtg evtgVar = ((eteg) evsn.parseFrom(eteg.a, inputStream, evrr.a())).b;
                        ejwl.b(!evtgVar.isEmpty(), "Empty metadata");
                        try {
                            inputStream.close();
                        } catch (IOException e2) {
                            etez.a.logp(Level.WARNING, "com.google.i18n.phonenumbers.metadata.init.MetadataParser", "parse", "Error closing input stream (ignored)", (Throwable) e2);
                        }
                        list = evtgVar;
                    } catch (IOException e3) {
                        throw new IllegalStateException("Unable to parse metadata file", e3);
                    }
                } finally {
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.b.a((etee) it.next());
            }
            this.c.add(str);
        } catch (IllegalArgumentException | IllegalStateException e4) {
            throw new IllegalStateException("Failed to read file ".concat(str), e4);
        }
    }

    @Override // defpackage.etfg
    public final etfh a(String str) {
        if (!this.c.contains(str)) {
            b(str);
        }
        return this.b;
    }
}
