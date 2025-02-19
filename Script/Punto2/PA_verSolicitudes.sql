/*
*********************************************************************************************************
*	Qui�n realiza	:	Jonathan Murillo Jaramillo														*
*	Cuando realiza	:	03/11/2022																		*
*	Para qui�n		:	Castor																			*
*	Descripci�n		:	Se crea procedimiento almacenado para consular datos solicitados.				*
*********************************************************************************************************
*/

IF EXISTS (SELECT * FROM sys.objects WHERE type = 'P' AND name = 'PA_verSolicitudes')
DROP PROCEDURE PA_verSolicitudes
GO
 CREATE PROCEDURE PA_verSolicitudes
  AS   
		SELECT s.NroSolicitud, p.NombreIntegrado, 
		CASE s.EstadoSolicitud
		WHEN 'A' THEN 'Activo'
		WHEN 'I' THEN 'Inactivo'
		ELSE 'N/A' END EstadoSolicitud,
		t.NroServicio, t.NombreServicio
		FROM solicitudesDeServicios s
		LEFT JOIN personasHabilesParaSolicitarServicios p ON p.id = s.IdentificaSolicitante
		INNER JOIN tipoServicio t ON s.TipoServicio = t.id