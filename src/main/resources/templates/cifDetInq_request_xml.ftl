<?xml version="1.0" encoding="UTF-8"?>
<Doc xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
	<CifDetInqRequest>
		<SocketHeader>
			<SKTMLEN>733</SKTMLEN>
			<SKTHEAD>*ARN</SKTHEAD>
			<SKTDEV></SKTDEV>
			<SKTSKNB></SKTSKNB>
			<SKTPORT></SKTPORT>
			<SKTFILL></SKTFILL>
		</SocketHeader>
		<DSPHeader>
			<I13HLEN>312</I13HLEN>
			<I13MLEN></I13MLEN>
			<I13VERS>0320</I13VERS>
			<I13HFMID>*DSP</I13HFMID>
			<I13FMID>MBASE</I13FMID>
			<I13SID>*ARN</I13SID>
			<I13DID></I13DID>
			<I13RTGN></I13RTGN>
			<I13MSTA></I13MSTA>
			<I13BIN></I13BIN>
			<I13NODE></I13NODE>
			<I13XID></I13XID>
			<I13SSNO>ARNMBSCFINQFNC</I13SSNO>
			<I13TRCD></I13TRCD>
			<I13RRNO></I13RRNO>
			<I13ACQN></I13ACQN>
			<I13TMNO>0</I13TMNO>
			<I13NREC>0</I13NREC>
			<I13NERR>0</I13NERR>
			<I13USER></I13USER>
			<I13TMID></I13TMID>
			<I13SUPV></I13SUPV>
			<I13MORE></I13MORE>
			<I13CUTO></I13CUTO>
			<I13UDTA></I13UDTA>
			<I13SDTA></I13SDTA>
			<I13TTYP>S</I13TTYP>
			<I13RCNF></I13RCNF>
			<I13RCNM></I13RCNM>
		</DSPHeader>
		<MBaseHeader>
			<HDRIND></HDRIND>
			<HDUSID></HDUSID>
			<HDRNUM>0</HDRNUM>
			<HDRBID>0</HDRBID>
			<HDEGPI>*END</HDEGPI>
			<HDBMSG>0</HDBMSG>
			<HDSRID>BTS</HDSRID>
			<HDDSID>RBK</HDDSID>
			<HDRTDQ></HDRTDQ>
			<HDTMID></HDTMID>
			<HDBKNO>06</HDBKNO>
			<HDBRNO></HDBRNO>
			<HDRSID></HDRSID>
			<HDTSID></HDTSID>
			<HDHSID></HDHSID>
			<HDTXCD>16200</HDTXCD>
			<HDACCD>I</HDACCD>
			<HDTMOD>R</HDTMOD>
			<HDNREC>1</HDNREC>
			<HDMREC>N</HDMREC>
			<HDSMTD>F</HDSMTD>
			<HDRCD1></HDRCD1>
			<HDRRE1></HDRRE1>
			<HDRCD2></HDRCD2>
			<HDRRE2></HDRRE2>
			<HDRCD3></HDRCD3>
			<HDRRE3></HDRRE3>
			<HDRCD4></HDRCD4>
			<HDRRE4></HDRRE4>
			<HDRCD5></HDRCD5>
			<HDRRE5></HDRRE5>
			<HDDTIN></HDDTIN>
			<HDTMIN></HDTMIN>
			<HDACTN></HDACTN>
			<HDACTY></HDACTY>
			<HDCIFN></HDCIFN>
			<HDFILR></HDFILR>
		</MBaseHeader>
		<RequestBody>
			<CFCIFN>${body.custNo?c}</CFCIFN>
		</RequestBody>
	</CifDetInqRequest>
</Doc>