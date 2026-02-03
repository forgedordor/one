package defpackage;

import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.text.MessageFormat;
import java.text.ParseException;
import org.apache.commons.logging.Log;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class femk {
    final /* synthetic */ feml a;

    public femk(feml femlVar) {
        this.a = femlVar;
    }

    public final void a(StreamTokenizer streamTokenizer, Reader reader, femm femmVar) throws IOException, ParseException, femo {
        String str = streamTokenizer.sval;
        feml femlVar = this.a;
        Log log = femlVar.a;
        if (log.isDebugEnabled()) {
            log.debug(MessageFormat.format("Property [{0}]", str));
        }
        femb fembVar = (femb) femmVar;
        feou feouVarA = fembVar.b.a(str.toUpperCase());
        femc femcVar = fembVar.d;
        femcVar.e = feouVarA;
        femh femhVar = femlVar.f;
        while (true) {
            feml femlVar2 = femhVar.a;
            if (feml.e(streamTokenizer, reader) != 59) {
                StringBuffer stringBuffer = new StringBuffer();
                streamTokenizer.ordinaryChar(34);
                int iE = feml.e(streamTokenizer, reader);
                while (iE != 10) {
                    if (streamTokenizer.ttype == -3) {
                        stringBuffer.append(streamTokenizer.sval);
                    } else {
                        stringBuffer.append((char) streamTokenizer.ttype);
                    }
                    iE = feml.e(streamTokenizer, reader);
                }
                streamTokenizer.quoteChar(34);
                try {
                    String string = stringBuffer.toString();
                    femc femcVar2 = ((femb) femmVar).d;
                    femc.b(femcVar2.e);
                    feou feouVar = femcVar2.e;
                    if (feouVar instanceof fenk) {
                        feouVar.c(fexb.d(string));
                    } else {
                        feouVar.c(string);
                    }
                    femc femcVar3 = fembVar.d;
                    femc.b(femcVar3.e);
                    femcVar3.e = fewt.a(femcVar3.e);
                    femz femzVar = femcVar3.c;
                    if (femzVar != null) {
                        femz femzVar2 = femcVar3.d;
                        if (femzVar2 != null) {
                            femzVar2.b.add(femcVar3.e);
                        } else {
                            femzVar.b.add(femcVar3.e);
                        }
                    } else {
                        fems femsVar = femcVar3.b;
                        if (femsVar != null) {
                            femsVar.a.add(femcVar3.e);
                        }
                    }
                    femcVar3.e = null;
                    return;
                } catch (ParseException e) {
                    ParseException parseException = new ParseException("[" + str + "] " + e.getMessage(), e.getErrorOffset());
                    parseException.initCause(e);
                    throw parseException;
                }
            }
            feml femlVar3 = femlVar2.g.a;
            femlVar3.b(streamTokenizer, reader, -3);
            String str2 = streamTokenizer.sval;
            Log log2 = femlVar3.a;
            if (log2.isDebugEnabled()) {
                log2.debug(a.a(str2, "Parameter [", "]"));
            }
            femlVar3.b(streamTokenizer, reader, 61);
            StringBuffer stringBuffer2 = new StringBuffer();
            if (feml.e(streamTokenizer, reader) == 34) {
                stringBuffer2.append('\"');
                stringBuffer2.append(streamTokenizer.sval);
                stringBuffer2.append('\"');
            } else if (streamTokenizer.sval != null) {
                stringBuffer2.append(streamTokenizer.sval);
                int iE2 = feml.e(streamTokenizer, reader);
                while (iE2 != 59 && iE2 != 58 && iE2 != 44) {
                    if (streamTokenizer.ttype == -3) {
                        stringBuffer2.append(streamTokenizer.sval);
                    } else {
                        stringBuffer2.append((char) streamTokenizer.ttype);
                    }
                    iE2 = feml.e(streamTokenizer, reader);
                }
                streamTokenizer.pushBack();
            } else if (streamTokenizer.sval == null) {
                streamTokenizer.pushBack();
            }
            try {
                String string2 = stringBuffer2.toString();
                try {
                    femc.b(femcVar.e);
                    femcVar.e.b.c(((femb) femmVar).c.a(str2.toUpperCase(), fexb.b(string2)));
                } catch (RuntimeException e2) {
                    if (!((femb) femmVar).d.e.a.startsWith("X-")) {
                        throw e2;
                    }
                }
            } catch (ClassCastException e3) {
                throw new femo("Error parsing parameter", feml.d(streamTokenizer, reader), e3);
            }
        }
    }
}
